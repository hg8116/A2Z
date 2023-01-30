// https://practice.geeksforgeeks.org/problems/count-digits5716/1

public class CountDigits {
    static int evenlyDivides(int N) {
        if (N == 0)
            return 0;

        int count = 0;
        int n = N;

        while (n > 0) {
            int curr = n % 10;
            if (curr != 0 && N % curr == 0)
                count++;

            n /= 10;
        }

        return count;
    }
}
