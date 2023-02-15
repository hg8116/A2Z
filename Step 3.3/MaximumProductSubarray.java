// https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/0?qa-rewrite=3336/print-all-valid-combinations-of-ip-address&show=3350&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximum-product-subarray

public class MaximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        long ans = arr[0], pre = 0, suf = 0;
        for (int i = 0; i < n; i++) {
            pre = (pre == 0 ? 1 : pre) * arr[i];
            suf = (suf == 0 ? 1 : suf) * arr[n - i - 1];

            ans = Math.max(ans, Math.max(pre, suf));
        }
        return ans;
    }
}
