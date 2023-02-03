// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sort-an-array-of-0s-1s-and-2s

public class SortAnArrayOf0s1sAnd2s {
    public static void sort012(int arr[], int n) {
        int[] count = new int[3];
        for (int i = 0; i < n; i++)
            count[arr[i]]++;

        int i = 0;
        while (count[0] > 0) {
            arr[i++] = 0;
            count[0]--;
        }

        while (count[1] > 0) {
            arr[i++] = 1;
            count[1]--;
        }

        while (count[2] > 0) {
            arr[i++] = 2;
            count[2]--;
        }
    }
}
