// https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-missing-and-repeating

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++)
            count[arr[i]]++;

        int[] ans = {-1, -1};
        for (int i = 1; i < n + 1; i++) {
            if (count[i] == 2)
                ans[0] = i;
            if (count[i] == 0)
                ans[1] = i;

        }

        return ans;
    }
}
