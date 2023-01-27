// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

public class Pattern17 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print((char) (j + 65));
            for (int j = i - 1; j >= 0; j--)
                System.out.print((char) (j + 65));
            System.out.println();
        }
    }
}
