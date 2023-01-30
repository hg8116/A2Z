// https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

public class SumOfAllDivisorsFrom1toN {
    static long sumOfDivisors(int N) {
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            ans += (N / i) * i;
        }
        return ans;
    }
}
