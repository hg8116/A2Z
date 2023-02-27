// https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=median-of-2-sorted-arrays-of-different-sizes

public class MedianOf2SortedArraysOfDifferentSizes {
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        if (n > m)
            return medianOfArrays(m, n, b, a);

        int start = 0, end = n;

        while (start <= end) {
            int cut1 = start + (end - start) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2 - 1];

            int r1 = cut1 == n ? Integer.MAX_VALUE : a[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : b[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else
                    return Math.max(l1, l2);
            } else if (l2 > r1)
                start = cut1 + 1;
            else
                end = cut1 - 1;
        }

        return 0.0;
    }
}
