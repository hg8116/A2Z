// https://practice.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort

public class QuickSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        while (true) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < j)
                swap(arr, i, j);
            else
                return j;
        }
    }
}
