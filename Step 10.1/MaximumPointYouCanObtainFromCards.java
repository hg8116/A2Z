// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaximumPointYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int window = n - k;
        int winSum = 0;
        for (int i = 0; i < window; i++)
            winSum += cardPoints[i];

        int min = winSum;
        int total = winSum;
        for (int i = window; i < n; i++) {
            total += cardPoints[i];
            winSum = winSum + cardPoints[i] - cardPoints[i - window];
            min = Math.min(min, winSum);
        }

        return total - min;
    }
}
