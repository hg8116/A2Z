// https://practice.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category=&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

public class MaxSumInSubArrays {
    public static long pairWithMaxSum(long arr[], long N) {
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] + arr[i + 1] > ans)
                ans = arr[i] + arr[i + 1];
        }

        return ans;
    }
}
