// https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr(int arr[], int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0, ans = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (map.containsKey(currSum - k)) {
                int len = i - map.get(currSum - k);
                ans = Math.max(ans, len);
            }
            if (!map.containsKey(currSum))
                map.put(currSum, i);
        }
        return ans;
    }
}
