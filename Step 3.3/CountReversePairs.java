// https://practice.geeksforgeeks.org/problems/count-reverse-pairs/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-reverse-pairs

import java.util.ArrayList;
import java.util.List;

public class CountReversePairs {
    public int countRevPairs(int n, int arr[]) {
        return mergeSort(arr, 0, n - 1);
    }

    int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);

            count += merge(arr, left, mid, right);
        }

        return count;
    }

    int merge(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2 * (long) arr[j])
                j++;
            count += j - (mid + 1);
        }

        int i = left;
        j = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                temp.add(arr[i++]);
            else
                temp.add(arr[j++]);
        }

        while (i <= mid)
            temp.add(arr[i++]);
        while (j <= right)
            temp.add(arr[j++]);

        for (i = left; i <= right; i++)
            arr[i] = temp.get(i - left);

        return count;
    }
}
