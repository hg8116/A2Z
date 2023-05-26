// https://leetcode.com/problems/candy/description/

import java.util.Arrays;
/*
* Divide the problem into two sub problems
* Find candies when going from left to right
* Find candies when going from right to left
* Traverse through the arrays an
*/
public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] l2r = new int[n];
        int[] r2l = new int[n];
        Arrays.fill(l2r, 1);
        Arrays.fill(r2l, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                l2r[i] = l2r[i - 1] + 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                r2l[i] = r2l[i + 1] + 1;
        }

        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += Math.max(l2r[i], r2l[i]);

        return ans;
    }
}
