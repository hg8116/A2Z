// https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category[]=Hash&category[]=Hash&company[]=Amazon&company[]=Amazon&page=1&query=category[]Hashcompany[]Amazonpage1company[]Amazoncategory[]Hash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWith0Sum {
    int maxLen(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                ans = i + 1;
            else {
                if (map.get(sum) != null)
                    ans = Math.max(ans, i - map.get(sum));
                else
                    map.put(sum, i);
            }
        }
        return ans;
    }
}
