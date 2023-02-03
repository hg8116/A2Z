// https://practice.geeksforgeeks.org/problems/next-permutation5226/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=next-permutation

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    /*
        Steps -
        1) Starting from n-2, find a[i] < a[i+1].
        2) Starting from n-1, find a[j] > a[i].
        3) Swap a[i] and a[j].
        4) Reverse the array from i+1 till n-1.
    */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j)
            swap(arr, i++, j--);
    }

    static List<Integer> nextPermutation(int n, int arr[]) {
        List<Integer> ans = new ArrayList<>();
        if (n <= 1) {
            ans.add(1);
            return ans;
        }
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i])
                j--;
            swap(arr, i, j);
        }

        reverse(arr, i + 1, n - 1);
        for (i = 0; i < n; i++)
            ans.add(arr[i]);

        return ans;
    }
}
