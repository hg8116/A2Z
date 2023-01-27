// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662284916/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_14

public class Pattern14 {
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 65; j < i + 66; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
