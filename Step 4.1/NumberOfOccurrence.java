// https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence

public class NumberOfOccurrence {
    int count(int[] arr, int n, int x) {
        int ind = binarySearch(arr, 0, n - 1, x);
        if (ind == -1)
            return 0;
        int count = 0;
        int left = ind;
        while (left > 0 && arr[left] == arr[left - 1]) {
            count++;
            left--;
        }

        while (ind < n - 1 && arr[ind] == arr[ind + 1]) {
            count++;
            ind++;
        }

        return count + 1;
    }

    int binarySearch(int[] arr, int start, int end, int x) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
