import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1
public class FruitIntoBaskets {
    public static int totalFruits(int N, int[] fruits) {
        int i = 0, j = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < N) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if (map.size() <= 2) {
                ans = Math.max(ans, j - i + 1);
            }
            while (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) <= 0)
                    map.remove(fruits[i]);
                i++;
            }
            j++;
        }

        return ans;
    }
}
