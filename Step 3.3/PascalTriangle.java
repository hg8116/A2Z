// https://practice.geeksforgeeks.org/problems/pascal-triangle0652/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pascal-triangle

import java.util.ArrayList;

public class PascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> ans = new ArrayList<>();
        int count = 1;
        long[] prev = new long[n + 1];
        prev[count] = 1;
        while (count <= n) {
            count++;
            long[] curr = new long[n + 1];
            for (int i = 1; i < count; i++)
                curr[i] = (prev[i - 1] + prev[i]) % 1000000007;
            prev = curr;
        }

        for (int i = 1; i < prev.length; i++)
            ans.add(prev[i]);

        return ans;
    }
}
