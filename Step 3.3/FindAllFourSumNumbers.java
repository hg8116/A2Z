// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-four-sum-numbers

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllFourSumNumbers {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                ArrayList<Integer> quad;
                int sum = k - arr[i] - arr[j];
                int start = j + 1;
                int end = n - 1;
                while (start < end) {
                    int temp = arr[start] + arr[end];
                    if (temp == sum) {
                        quad = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[start], arr[end]));
                        if (!ans.contains(quad))
                            ans.add(quad);
                        start++;
                        end--;
                    } else if (temp > sum)
                        end--;
                    else
                        start++;
                }
            }
        }
        return ans;
    }
}
