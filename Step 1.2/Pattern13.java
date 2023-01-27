// https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_13

public class Pattern13 {
    void printTriangle(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
