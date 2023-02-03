// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell2615/0?company[]=Intuit+&page=1&query=company[]Intuit+page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=stock-buy-and-sell

public class StockBuyAndSell {
    public void stockBuySell(int[] arr, int n) {
        int buy = 0, sell = 0, i = 1;

        while (i < n) {
            buy = i - 1;
            while (i < n && arr[i] > arr[i - 1])
                i++;
            sell = i - 1;
            if (buy != sell) System.out.print("(" + buy + " " + sell + ") ");
            i++;
        }
        System.out.println(sell == 0 ? "No Profit" : "");
    }
}
