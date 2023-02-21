// https://practice.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root

public class SquareRootOfANumber {
    long floorSqrt(long x) {
        if (x <= 1)
            return x;

        long start = 0, end = x / 2;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x)
                return mid;
            else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }
}
