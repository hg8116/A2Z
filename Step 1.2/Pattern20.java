// https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_20

public class Pattern20 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            for (int j = 0; j < (n - i - 1) * 2; j++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("*");
            for (int j = 0; j < (i + 1) * 2; j++)
                System.out.print(" ");
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
