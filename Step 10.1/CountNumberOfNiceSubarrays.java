// https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++)
            nums[i] %= 2;
        return (helper(nums, k) - helper(nums, k - 1));
    }

    int helper(int[] nums, int k) {
        int count = 0, i = 0, j = 0, ans = 0;

        for (j = 0; j < nums.length; j++) {
            if (nums[j] == 1)
                count++;
            while (count > k) {
                if (nums[i] == 1)
                    count--;
                i++;
            }
            ans += j - i + 1;
        }

        return ans;
    }

    // Another Method
    public int numberOfSubarrays2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = nums.length;
        for (int i = 0; i < n; i++)
            nums[i] %= 2;
        int ans = 0, curr = 0;
        for (int i = 0; i < n; i++) {
            curr += nums[i];
            if (map.containsKey(curr - k))
                ans += map.get(curr - k);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return ans;
    }
}
