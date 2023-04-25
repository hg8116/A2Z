import java.util.*;

import static java.util.Arrays.sort;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        pq.add(3);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
