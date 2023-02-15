// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=first-and-last-occurrences-of-x

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> ans = new ArrayList<>();
        ans.add((long) findLeft(arr, 0, n - 1, x));
        ans.add((long) findRight(arr, 0, n - 1, x));

        return ans;
    }

    int findLeft(long arr[], int start, int end, int x) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x)
                end = mid - 1;
            else
                start = mid + 1;
            if (arr[mid] == x)
                ans = mid;
        }

        return ans;
    }

    int findRight(long arr[], int start, int end, int x) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x)
                start = mid + 1;
            else
                end = mid - 1;
            if (arr[mid] == x)
                ans = mid;
        }

        return ans;
    }
}
