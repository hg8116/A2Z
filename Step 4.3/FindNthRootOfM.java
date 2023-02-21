// https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-nth-root-of-m

public class FindNthRootOfM {
    public int NthRoot(int n, int m) {
        int start = 1, end = m;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            float num = m;
            for (int i = 0; i < n; i++)
                num = num / mid;
            if (num == 1)
                return mid;
            else if (num > 1)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
