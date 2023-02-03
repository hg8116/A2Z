// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=majority-element

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majorityElement(int a[], int size) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if (map.get(a[i]) > size / 2) {
                return a[i];
            }
        }
        return -1;
    }
}
