import java.util.Arrays;

public class ReverseAnArray {
    static int[] reverseArray(int[] arr) {
        helper(arr, 0, arr.length - 1);
        return arr;
    }

    static void helper(int[] arr, int i, int j) {
        if (i > j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        helper(arr, ++i, --j);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
