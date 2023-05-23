// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

import java.util.Arrays;

public class JobSequencingProblem {
    class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDL = 0;
        for (int i = 0; i < n; i++)
            maxDL = Math.max(arr[i].deadline, maxDL);
        int[] done = new int[maxDL + 1];

        int[] ans = {0, 0};
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (done[j] == 0) {
                    done[j] = 1;
                    ans[0]++;
                    ans[1] += arr[i].profit;
                    break;
                }
            }
        }

        return ans;
    }
}
