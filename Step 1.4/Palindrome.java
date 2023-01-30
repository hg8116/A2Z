// https://practice.geeksforgeeks.org/problems/palindrome0746/1

public class Palindrome {
    public String is_palindrome(int n) {
        int copy = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return (copy == rev) ? "Yes" : "No";
    }
}
