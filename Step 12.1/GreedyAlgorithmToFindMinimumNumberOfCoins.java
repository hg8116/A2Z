// https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithmToFindMinimumNumberOfCoins {
    static List<Integer> minPartition(int N) {
        List<Integer> ans = new ArrayList<>();
        int[] deno = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int i = 0;
        while (i < deno.length && N > 0) {
            while (deno[i] <= N) {
                ans.add(deno[i]);
                N -= deno[i];
            }
            i++;
        }

        return ans;

    }
}
