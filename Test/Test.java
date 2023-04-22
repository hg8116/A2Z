import java.util.*;

import static java.util.Arrays.sort;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 1, 1, 3, 4};
        int count = 0;
        int ans = -1;
        int curr = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == curr)
                count++;
            else{
                count--;
                if(count == 0){
                    curr = arr[i];
                    count++;
                }
            }
        }

        System.out.println(curr);
    }
}
