// https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int zeros = 0;
        int ans = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeros++;
            if (zeros > k) {
                if (nums[j] == 0) zeros--;
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}
