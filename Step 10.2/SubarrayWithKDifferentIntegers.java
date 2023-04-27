// https://leetcode.com/problems/subarrays-with-k-different-integers/description/

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }

    int helper(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (j = 0; j < n; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.size() > k) {
                int curr = map.get(nums[i]) - 1;
                if (curr == 0)
                    map.remove(nums[i]);
                else
                    map.put(nums[i], curr);
                i++;
            }
            if (map.size() <= k)
                ans += j - i + 1;
        }
        return ans;
    }
}
