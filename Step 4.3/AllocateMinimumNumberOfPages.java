// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=allocate-minimum-number-of-pages

public class AllocateMinimumNumberOfPages {
    public static int findPages(int[] A, int N, int M) {
        if (N < M)
            return -1;
        int start = A[0], end = 0;
        for (int x : A)
            end += x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (helper(mid, A, M)) {
                ans = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return ans;
    }

    static boolean helper(int max, int[] arr, int m) {
        int count = 1, sum = 0;
        ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                return false;
            if (arr[i] + sum > max) {
                count++;
                sum = arr[i];
            } else
                sum += arr[i];
        }

        if (count > m)
            return false;
        return true;
    }
}
