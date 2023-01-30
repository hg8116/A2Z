// https://practice.geeksforgeeks.org/problems/reverse-bits3556/1

public class ReverseBits {
    static Long reversedBits(Long X) {
        long ans = 0;
        int countDig = 0;

        while (X > 0) {
            ans = (X & 1) + ans * 2;
            X >>= 1;
            countDig++;
        }
        for (int i = 0; i < 32 - countDig; i++) {
            ans <<= 1;
        }

        return ans;
    }
}
