// https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-the-element-that-appears-once-in-sorted-array

public class FindTheElementThatAppearsOnceInSortedArray {
    int findOnce(int arr[], int n) {
        int start = 0, end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == arr[mid ^ 1])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return arr[start];
    }
}
