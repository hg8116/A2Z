import java.util.PriorityQueue;

public class FractionalKnapsackProblem {
    class Item {
        int value, weight;

        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }

    double fractionalKnapsack(int W, Item arr[], int n) {
        double ans = 0;
        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> b.value * a.weight - a.value * b.weight);
        for (int i = 0; i < n; i++)
            pq.add(arr[i]);
        while (!pq.isEmpty() && W > 0) {
            Item temp = pq.poll();
            if (temp.weight <= W) {
                ans += temp.value;
                W -= temp.weight;
            } else {
                ans += (double) temp.value / (double) temp.weight * W;
                break;
            }
        }
        return ans;
    }
}
