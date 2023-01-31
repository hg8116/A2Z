// https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-matrix

public class SearchInAMatrix {
    public static int matSearch(int mat[][], int n, int m, int x) {
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (mat[i][j] == x)
                return 1;
            else if (mat[i][j] < x)
                i++;
            else
                j--;
        }

        return 0;
    }
}
