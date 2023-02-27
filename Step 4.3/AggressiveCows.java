// https://practice.geeksforgeeks.org/problems/aggressive-cows/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=aggressive-cows

import java.util.Arrays;

public class AggressiveCows {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start = 1, end = stalls[n - 1] - stalls[0];
        int ans = start;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (helper(mid, k, stalls)) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return ans;
    }

    static boolean helper(int dist, int k, int[] stalls) {
        int curr = stalls[0], count = 1;
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - curr >= dist) {
                count++;
                curr = stalls[i];
            }
            if (count == k)
                return true;
        }

        return false;
    }
}
