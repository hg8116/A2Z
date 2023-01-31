// https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array

public class MoveAllZeroesToEndOfArray {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void pushZerosToEnd(int[] arr, int n) {
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
    }
}
