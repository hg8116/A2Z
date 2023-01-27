// https://practice.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22

public class Pattern22 {
    void printSquare(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int left = j;
                int top = i;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(left, top), Math.min(right, bottom)) + " ");
            }
            System.out.println();
        }
    }
}
