// https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=overlapping_intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    public int[][] overlappedInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> ans = new ArrayList<>();

        for (int[] x : intervals) {
            if (x[0] <= end)
                end = Math.max(end, x[1]);
            else {
                ans.add(new int[]{start, end});
                start = x[0];
                end = x[1];
            }
        }

        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}
