// https://leetcode.com/problems/jump-game-ii/description/

public class JumpGameII {
    public int jump(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int ans = 0;

        while (right < n - 1) {
            int far = 0;
            for (int i = left; i <= right; i++)
                far = Math.max(far, nums[i] + i);
            left = right + 1;
            right = far;
            ans++;
        }

        return ans;
    }
}
