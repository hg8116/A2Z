// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class ArmstrongNumbers {
    static String armstrongNumber(int n) {
        int sum = 0;
        int copy = n;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig * dig;
            n /= 10;
        }
        return (sum == copy) ? "Yes" : "No";
    }
}
