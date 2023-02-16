// https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=minimum-element-in-a-sorted-and-rotated-array

public class MinimumElementInASortedAndRotatedArray {
    int findMin(int arr[], int n) {
        return arr[findPivot(arr, 0, n - 1) + 1];
    }

    int findPivot(int arr[], int start, int end) {
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
