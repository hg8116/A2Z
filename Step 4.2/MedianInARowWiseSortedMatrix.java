// https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=median-in-a-row-wise-sorted-matrix

public class MedianInARowWiseSortedMatrix {
    int median(int matrix[][], int n, int m) {
        int start = 1, end = 1000000000;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i = 0; i < n; i++)
                count += findSmaller(matrix[i], mid);
            if (count <= (n * m) / 2)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return start;
    }

    int findSmaller(int[] arr, int x) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return start;
    }
}
