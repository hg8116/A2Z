// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1?company[]=Synopsys&company[]=Synopsys&page=1&query=company[]Synopsyspage1company[]Synopsys&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-two-sorted-arrays

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int end1 = n - 1, start2 = 0;
        while (end1 >= 0 && start2 < m && arr1[end1] > arr2[start2]) {
            long temp = arr1[end1];
            arr1[end1] = arr2[start2];
            arr2[start2] = temp;
            end1--;
            start2++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
