// https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/0?problemType=functional&page=1&query=problemTypefunctionalpage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-consecutive-subsequence

public class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];

        for (int x : arr)
            count[x]++;

        int ans = 0;
        int currMax = 0;
        for (int i = 0; i < max; i++) {
            if (count[i] >= 1 && count[i + 1] >= 1) {
                currMax++;
                ans = Math.max(currMax, ans);
            } else {
                currMax = 0;
            }
        }
        return ans + 1;
    }
}
