// https://practice.geeksforgeeks.org/problems/make-zeroes4042/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=make-zeroes

public class MakeZeroes {
    public void MakeZeros(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    int sum = 0;
                    if (i - 1 >= 0)
                        sum += matrix[i - 1][j];
                    if (i + 1 < n)
                        sum += matrix[i + 1][j];
                    if (j - 1 >= 0)
                        sum += matrix[i][j - 1];
                    if (j + 1 < m)
                        sum += matrix[i][j + 1];
                    ans[i][j] = sum;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ans[i][j] > 0) {
                    matrix[i][j] = ans[i][j];
                    if (i - 1 >= 0)
                        matrix[i - 1][j] = 0;
                    if (i + 1 < n)
                        matrix[i + 1][j] = 0;
                    if (j - 1 >= 0)
                        matrix[i][j - 1] = 0;
                    if (j + 1 < m)
                        matrix[i][j + 1] = 0;
                }
            }
        }
    }
}
