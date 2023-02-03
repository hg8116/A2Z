// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = n - 1;
        int currMax = arr[i];
        while (i >= 0) {
            if (arr[i] >= currMax) {
                ans.add(arr[i]);
                currMax = arr[i];
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
