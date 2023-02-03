// https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=array-of-alternate-ve-and-ve-nos

import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveAndNegativeNumbers {
    void rearrange(int arr[], int n) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }

        int x = 0, i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            if (x % 2 == 0)
                arr[x++] = pos.get(i++);
            else
                arr[x++] = neg.get(j++);
        }

        while (i < pos.size())
            arr[x++] = pos.get(i++);
        while (j < neg.size())
            arr[x++] = neg.get(j++);
    }
}
