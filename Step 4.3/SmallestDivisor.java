// https://practice.geeksforgeeks.org/problems/smallest-divisor/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=smallest-divisor

public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int K) {
        int start = 1, end = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int div = 0;
            for (int x : nums)
                div += (x + mid - 1) / mid;
            if (div > K)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
