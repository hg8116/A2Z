// https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

public class Pattern12 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(j + 1 + " ");
            for (int j = 0; j < (n - i - 1) * 2; j++)
                System.out.print("  ");
            for (int j = i; j >= 0; j--)
                System.out.print(j + 1 + " ");
            System.out.println();
        }
    }
}
