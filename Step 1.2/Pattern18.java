// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662286302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_18

public class Pattern18 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print((char) (n - j + 64) + " ");
            System.out.println();
        }
    }
}
