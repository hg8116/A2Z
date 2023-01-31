// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-pairs-whose-sum-is-x

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAllPairsWithAGivenSum {
    class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public pair[] allPairs(long a[], long b[], long n, long m, long x) {
        Map<Long, Integer> map = new HashMap<>();
        Arrays.sort(a);
        ArrayList<pair> list = new ArrayList<>();
        for (long i : b)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (long i : a) {
            if (map.containsKey(x - i))
                list.add(new pair(i, x - i));
        }

        pair[] ans = new pair[list.size()];
        list.toArray(ans);

        return ans;
    }
}
