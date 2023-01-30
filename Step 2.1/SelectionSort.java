// https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

public class SelectionSort {
    int select(int arr[], int n) {
        int max = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > arr[max])
                max = i;
        }

        return max;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxInd = select(arr, last);
            swap(arr, maxInd, last);
        }
    }
}
