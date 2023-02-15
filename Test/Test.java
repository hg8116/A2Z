import java.util.*;

import static java.util.Arrays.sort;

public class Test {
    static int[] findTwoElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int correctInd = arr[i] - 1;
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[correctInd];
                arr[correctInd] = temp;
            }
        }

        int[] ans = {-1, -1};
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }
}
