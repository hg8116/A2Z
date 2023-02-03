// https://practice.geeksforgeeks.org/problems/cd61add036272faa69c6814e34aa7007d5a25aa6/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=spiral_matrix

public class SpiralMatrix {
    public int findK(int arr[][], int n, int m, int k) {
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = m - 1;
        int count = 0, ans = 0;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                if (count == k)
                    break;
                ans = arr[startRow][i];
                count++;
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                if (count == k)
                    break;
                ans = arr[i][endCol];
                count++;
            }
            endCol--;
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    if (count == k)
                        break;
                    ans = arr[endRow][i];
                    count++;
                }
                endRow--;
            }
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    if (count == k)
                        break;
                    ans = arr[i][startCol];
                    count++;
                }
                startCol++;
            }
        }
        return ans;
    }
}
