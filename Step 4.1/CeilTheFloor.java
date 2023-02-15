// https://practice.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor

import java.util.Arrays;

public class CeilTheFloor {
    int[] getFloorAndCeil(int[] arr, int n, int x) {
        Arrays.sort(arr);
        int start = 0, end = n - 1;
        int floor = -1, ceil = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return new int[]{arr[mid], arr[mid]};
            } else if (arr[mid] < x) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                ceil = arr[mid];
                end = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}
