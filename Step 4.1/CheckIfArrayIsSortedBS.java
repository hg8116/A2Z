
// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
public class CheckIfArrayIsSortedBS {
    boolean arraySortedOrNot(int[] arr, int n) {
        return helper(arr, 0, n - 1);
    }

    boolean helper(int[] arr, int start, int end) {
        if (arr[start] == arr[end])
            return true;
        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1])
            return false;

        boolean leftSorted = helper(arr, start, mid);
        boolean rightSorted = helper(arr, mid + 1, end);

        return leftSorted && rightSorted;

    }
}
