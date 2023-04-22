// https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int i = 0, ans = 0;
        int[] count = new int[26];
        int maxVal = 0;
        for (int j = 0; j < s.length(); j++) {
            count[s.charAt(j) - 'A']++;
            maxVal = Math.max(maxVal, count[s.charAt(j) - 'A']);
            while (j - i + 1 - maxVal > k) {
                count[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
