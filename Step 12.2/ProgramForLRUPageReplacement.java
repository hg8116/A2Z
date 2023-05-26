// https://practice.geeksforgeeks.org/problems/page-faults-in-lru5603/1

/*
* Use queue to add pages
* Add a page if it does not exist in queue and increment page fault
* If the size of queue exceeds c, pop from the queue
* If page exists, remove and add it on top
*/

import java.util.LinkedList;
import java.util.Queue;

public class ProgramForLRUPageReplacement {
    static int pageFaults(int n, int c, int pages[]) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (q.contains(pages[i])) {
                q.remove(pages[i]);
                q.add(pages[i]);
            } else {
                ans++;
                q.add(pages[i]);
                if (q.size() > c)
                    q.poll();
            }
        }

        return ans;
    }
}
