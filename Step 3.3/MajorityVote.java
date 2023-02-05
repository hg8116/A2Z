// https://practice.geeksforgeeks.org/problems/majority-vote/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=majority-vote

import java.util.ArrayList;

public class MajorityVote {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        int can1 = -1, can2 = -1;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == can1)
                count1++;
            else if (nums[i] == can2)
                count2++;
            else if (count1 == 0) {
                can1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                can2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == can1)
                count1++;
            if (nums[i] == can2)
                count2++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (count1 > n / 3)
            ans.add(can1);
        if (count2 > n / 3)
            ans.add(can2);
        if (ans.size() == 0)
            ans.add(-1);
        return ans;
    }
}
