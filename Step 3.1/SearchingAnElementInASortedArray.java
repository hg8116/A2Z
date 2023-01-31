// https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

public class SearchingAnElementInASortedArray {
    static int searchInSorted(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                return 1;
        }

        return -1;
    }
}
