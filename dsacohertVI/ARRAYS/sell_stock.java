
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class sell_stock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(result(prices));
    }

    static int result(int[] prices) {
        int minsofar = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            minsofar = Math.min(minsofar, prices[i]);
            profit = Math.max(profit, prices[i] - minsofar);
        }
        return profit;
    }

}
