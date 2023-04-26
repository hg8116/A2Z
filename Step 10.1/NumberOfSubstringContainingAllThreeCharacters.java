// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
public class NumberOfSubstringContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int a = -1, b = -1, c = -1;
        int[] last = {-1, -1, -1};
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
            if (i > 1)
                ans += Math.min(Math.min(last[0], last[1]), last[2]) + 1;
        }
        return ans;
    }
}
