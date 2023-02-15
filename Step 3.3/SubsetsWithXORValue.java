// https://practice.geeksforgeeks.org/problems/subsets-with-xor-value2023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=subsets-with-xor-value

public class SubsetsWithXORValue {
    static int helper(int[] arr, int n, int k) {
        if (n <= 0) {
            if (k == 0)
                return 1;
            else
                return 0;
        }

        int taken = helper(arr, n - 1, arr[n - 1] ^ k);
        int notTaken = helper(arr, n - 1, k);

        return taken + notTaken;
    }

    static int subsetXOR(int arr[], int N, int K) {
        return helper(arr, N, K);
    }
}
