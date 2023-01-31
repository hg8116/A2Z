import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

public class Test {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void helper(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i] - 1;
            if (correct < n && arr[i] != arr[correct]) {
                swap(arr, correct, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] ans = {1, 4, 3};
        helper(ans, ans.length);
        System.out.println(Arrays.toString(ans));
    }
}
