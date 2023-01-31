// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s

public class RowWithMax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 1)
                    return i;
            }
        }
        return -1;
    }
}
