// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-rotated-array

public class SearchInARotatedArray {
    int search(int arr[], int l, int h, int key) {
        int pivot = findPivot(arr, l, h);
        int ans = -1;
        ans = binarySearch(arr, l, pivot, key);
        if (ans == -1)
            ans = binarySearch(arr, pivot + 1, h, key);

        return ans;
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

    int findPivot(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            else if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            else if (arr[mid] >= arr[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
