// https://leetcode.com/problems/insert-interval/description/

/*
We have been given list of intervals sorted according to the start time. We need to insert a given interval in it.
We need to iterate through array keeping the following conditions in mind.
If the newEnd < interval[i][0], just append the interval and add all the original intervals after it.
If the newStart > interval[i][1], just add the original interval and move on.
Else update the newStart = min(newStart, interval[i][0]) and newEnd = max(newEnd, interval[i][1]). But dont just add it yet because the next intervals might be overlapping.
return the intervals
*/

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[1] < intervals[i][0]) {
                ans.add(newInterval);
                newInterval = intervals[i];
            } else if (newInterval[0] > intervals[i][1]) {
                ans.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        ans.add(newInterval);

        return ans.toArray(new int[ans.size()][]);
    }
}
