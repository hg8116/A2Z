
// https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number

public class MissingNumber {
    public static int missingNumber(int arr[], int n) {
        int sum = (n * (n + 1)) / 2;
        int curr = 0;
        for (int i = 0; i < arr.length; i++)
            curr += arr[i];

        return sum - curr;
    }
}
