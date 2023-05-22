// https://leetcode.com/problems/jump-game/description/

/*
* Start from the end.
* If the goal can be reached from current index, make the current index as new goal
* When loop ends, if the goal is 0 return true
* */

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n - 1;
        int i = n - 2;

        while (i >= 0) {
            int diff = goal - i;
            if (nums[i] >= diff)
                goal = i;
            i--;
        }

        return goal == 0;
    }
}
