// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

import java.util.Arrays;

public class NMeetingsInOneRoom {
    public static int maxMeetings(int start[], int end[], int n) {
        int[][] meet = new int[n][2];
        for (int i = 0; i < n; i++) {
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }
        Arrays.sort(meet, (a, b) -> a[1] - b[1]);
        int etime = meet[0][1];
        int ans = 1;

        for (int i = 1; i < n; i++) {
            if (etime < meet[i][0]) {
                ans++;
                etime = meet[i][1];
            }
        }

        return ans;
    }
}
