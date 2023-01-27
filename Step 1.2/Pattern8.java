// https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8

public class Pattern8 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = 0; j < n - i; j++)
                System.out.print("*");
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
