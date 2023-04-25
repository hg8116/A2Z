// https://leetcode.com/problems/binary-subarrays-with-sum/description/

public class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return (helper(nums, goal) - helper(nums, goal - 1));
    }

    int helper(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int i = 0, j = 0;
        int curr = 0, ans = 0;

        while (j < nums.length) {
            curr += nums[j];
            while (curr > goal)
                curr -= nums[i++];

            ans += j - i + 1;
            j++;
        }

        return ans;
    }
}
