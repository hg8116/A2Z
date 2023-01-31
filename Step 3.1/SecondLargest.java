// https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

public class SecondLargest {
    int print2largest(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }

        return secondMax;
    }
}
