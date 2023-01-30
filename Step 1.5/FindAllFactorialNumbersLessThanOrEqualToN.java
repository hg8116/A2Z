// https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n

import java.util.ArrayList;

public class FindAllFactorialNumbersLessThanOrEqualToN {
    static ArrayList<Long> factorialNumbers(long N) {
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
            if (fact > N)
                return ans;
            ans.add(fact);
        }

        return ans;
    }
}
