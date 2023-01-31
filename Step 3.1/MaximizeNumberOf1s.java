// https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximize-number-of-1s

public class MaximizeNumberOf1s {
    int findZeroes(int arr[], int n, int m) {
        int i = 0, j = 0, ans = 0;

        while (j < n) {
            if (arr[j] == 0)
                m--;
            if (m >= 0)
                ans = Math.max(ans, j - i + 1);
            if (m < 0) {
                if (arr[i] == 0)
                    m++;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
}
