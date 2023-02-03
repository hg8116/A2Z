// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/0?company[]=Visa&company[]=Visa&page=2&query=company[]Visapage2company[]Visa&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=kadanes-algorithm

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum += arr[i];
            if (arr[i] > currSum)
                currSum = arr[i];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
