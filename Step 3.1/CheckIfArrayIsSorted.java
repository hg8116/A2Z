// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted

public class CheckIfArrayIsSorted {
    boolean arraySortedOrNot(int[] arr, int n) {
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                flag = 1;
        }
        return !(flag == 1);
    }
}
