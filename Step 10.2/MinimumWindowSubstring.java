// https://leetcode.com/problems/minimum-window-substring/description/
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int i = 0, j = 0, n = s.length(), size = Integer.MAX_VALUE;
        String ans = "";
        int[] scount = new int[256];
        int[] tcount = new int[256];

        for (i = 0; i < t.length(); i++)
            tcount[t.charAt(i)]++;
        i = 0;
        while (j < n) {
            scount[s.charAt(j)]++;
            while (check(scount, tcount)) {
                if (j - i + 1 < size) {
                    size = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
                scount[s.charAt(i)]--;
                i++;
            }
            j++;
        }

        return ans;
    }

    boolean check(int[] scount, int[] tcount) {
        for (int i = 0; i < scount.length; i++) {
            if (scount[i] < tcount[i])
                return false;
        }
        return true;
    }
}
