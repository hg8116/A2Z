// https://practice.geeksforgeeks.org/problems/shortest-job-first/1

import java.util.Arrays;

/*
* Sort the bt
* Find the wt and ct
* Return the average of wt
*/

public class ProgramForSJFCPUScheduling {
    static int solve(int bt[]) {
        Arrays.sort(bt);
        int n = bt.length;
        int[] wt = new int[n];
        int[] ct = new int[n];
        ct[0] = bt[0];
        for (int i = 1; i < n; i++) {
            wt[i] = ct[i - 1];
            ct[i] = wt[i] + bt[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += wt[i];
        return ans / n;
    }
}
