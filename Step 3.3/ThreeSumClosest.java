// https://practice.geeksforgeeks.org/problems/3-sum-closest/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=3-sum-closest

import java.util.Arrays;

public class ThreeSumClosest {
    static int closest3Sum(int arr[], int n, int x) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            int target = x - arr[i];
            while (j < k) {
                int sum = arr[j] + arr[k];
                int diff = Math.abs(sum + arr[i] - x);
                if (diff < min) {
                    min = diff;
                    ans = sum + arr[i];
                }
                if (sum < target)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
}
