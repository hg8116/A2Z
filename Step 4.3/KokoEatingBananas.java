// https://practice.geeksforgeeks.org/problems/koko-eating-bananas/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=koko-eating-bananas

public class KokoEatingBananas {
    public static int Solve(int N, int[] piles, int H) {
        int start = 1, end = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i = 0; i < N; i++)
                count += Math.ceil((double) piles[i] / mid);
            if (count > H)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
