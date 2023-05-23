// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

/*
 * Sort both the arrays separately
 * Find the overlapping time intervals
 * Increment the count and keep the maximum ans
 */

import java.util.Arrays;

public class MinimumNumberOfPlatformsRequiredForARailway {
    static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int ans = 0;
        int curr = 0;

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                curr++;
                ans = Math.max(curr, ans);
                i++;
            } else if (arr[i] > dep[j]) {
                j++;
                curr--;
            }
        }
        return ans;

    }
}
