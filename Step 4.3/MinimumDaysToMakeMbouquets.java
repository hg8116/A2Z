// https://practice.geeksforgeeks.org/problems/minimum-days-to-make-m-bouquets/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=minimum-days-to-make-m-bouquets

public class MinimumDaysToMakeMbouquets {
    public static int solve(int m, int k, int[] arr) {
        int n = arr.length;
        if (m * k > n)
            return -1;

        int start = arr[0], end = arr[0];
        for (int i = 1; i < n; i++) {
            start = arr[i] < start ? arr[i] : start;
            end = arr[i] > end ? arr[i] : end;
        }

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int bou = 0, flo = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid)
                    flo = 0;
                else if (++flo >= k) {g
                    bou++;
                    flo = 0;
                }
            }
            if (bou < m)
                start = mid + 1;
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
