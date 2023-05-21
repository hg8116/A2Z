// https://leetcode.com/problems/valid-parenthesis-string/description/

public class ValidParenthesisChecker {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                max--;
                min--;
            } else if (c == '*') {
                max++;
                min--;
            }
            if (max < 0)
                return false;
            min = Math.max(0, min);
        }
        return min == 0;
    }
}
