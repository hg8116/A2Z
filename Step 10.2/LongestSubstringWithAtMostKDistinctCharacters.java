// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public int longestkSubstr(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0, j=0, n=s.length();
        int ans=0;
        while(j < n){
            char x = s.charAt(j);
            map.put(x, map.getOrDefault(x, 0) + 1);
            if(map.size() == k)
                ans = Math.max(ans, j-i+1);
            while(map.size() > k){
                int curr = map.get(s.charAt(i));
                curr--;
                if(curr == 0)
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i), curr);
                i++;
            }
            j++;
        }
        return (ans == 0) ? -1 : ans;
    }
}
