// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

public class FrequenciesOfLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P) {
        int size = Math.max(N, P);
        int[] count = new int[size + 1];
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        for (int i = 0; i < arr.length; i++)
            arr[i] = count[i + 1];
    }
}
