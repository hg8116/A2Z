
// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> set = new TreeSet<>();
        for (int x : arr1)
            set.add(x);
        for (int x : arr2)
            set.add(x);
        return new ArrayList<>(set);
    }
}
