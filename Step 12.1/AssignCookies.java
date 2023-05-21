// https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;

        int i = 0, j = 0;
        int n = g.length, m = s.length;

        while (i < n && j < m) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                ans++;
            } else
                j++;
        }
        return ans;
    }
}
