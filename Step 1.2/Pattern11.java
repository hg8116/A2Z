//https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11

public class Pattern11 {
    void printTriangle(int n) {
        int flag;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                flag = 1;
            else
                flag = 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(flag + " ");
                flag = 1 - flag;
            }
            System.out.println();
        }
    }
}
