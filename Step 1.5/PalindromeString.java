// https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=palindrome-string

public class PalindromeString {
    int isPalindrome(String S) {
        if (S.length() == 1)
            return 1;

        return helper(S, 0, S.length() - 1) ? 1 : 0;
    }

    boolean helper(String s, int i, int j) {
        if (s.charAt(i) != s.charAt(j))
            return false;

        if (i > j)
            return true;

        return helper(s, ++i, --j);
    }
}
