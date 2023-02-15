// https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=inversion-of-array

public class CountInversions {
    static long inversionCount(long arr[], long n) {
        long[] temp = new long[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    static long mergeSort(long[] arr, long[] temp, int left, int right) {
        int mid;
        long count = 0;
        if (left < right) {
            mid = (right + left) / 2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);

            count += merge(arr, temp, left, mid + 1, right);
        }

        return count;
    }

    static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        long count = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                count += mid - i;
            }
        }

        while (i <= mid - 1)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return count;
    }
}
