// https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-first-n-fibonacci-numbers

public class PrintFirstNFibonacciNumbers {
    public static long[] printFibb(int n) {
        long[] ans = new long[n];
        ans[0] = 1;
        if (n == 1)
            return ans;
        ans[1] = 1;

        for (int i = 2; i < n; i++)
            ans[i] = ans[i - 1] + ans[i - 2];

        return ans;
    }
}
