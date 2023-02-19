// https://leetcode.com/problems/find-a-peak-element-ii/description/

public class FindPeakElement2D {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int startRow = 0, endRow = n - 1;
        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            int maxCol = 0;
            for (int i = 0; i < m; i++)
                maxCol = mat[midRow][i] >= mat[midRow][maxCol] ? i : maxCol;

            boolean isUpBig = midRow - 1 >= startRow && mat[midRow][maxCol] < mat[midRow - 1][maxCol];
            boolean isDownBig = midRow + 1 <= endRow && mat[midRow][maxCol] < mat[midRow + 1][maxCol];

            if (!isUpBig && !isDownBig)
                return new int[]{midRow, maxCol};
            if (isDownBig)
                startRow = midRow + 1;
            else
                endRow = midRow - 1;
        }

        return new int[]{-1, -1};
    }
}
