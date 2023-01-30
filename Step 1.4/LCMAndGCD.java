// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

public class LCMAndGCD {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] ans = new Long[2];
        ans[1] = findGcd(A, B);
        ans[0] = (A * B) / ans[1];
        return ans;
    }

    static long findGcd(Long A, Long B) {
        if (B == 0)
            return A;
        return findGcd(B, A % B);
    }
}
