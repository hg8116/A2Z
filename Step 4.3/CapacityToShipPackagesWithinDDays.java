// https://practice.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=capacity-to-ship-packages-within-d-days

public class CapacityToShipPackagesWithinDDays {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        int start = arr[0], end = 0;
        for (int x : arr) {
            start = Math.max(x, start);
            end += x;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0, sum = 0;
            for (int x : arr) {
                sum += x;
                if (sum > mid) {
                    count++;
                    sum = x;
                }
            }

            if (count >= D)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return start;
    }
}
