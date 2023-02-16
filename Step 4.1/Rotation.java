// https://practice.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation

public class Rotation {
    int findKRotation(int arr[], int n) {
        return findPivot(arr, 0, n - 1) + 1;
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
