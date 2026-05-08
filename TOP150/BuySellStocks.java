// Amazon - 62 Microsoft - 19 Bloomberg - 15 Facebook - 12 Google - 1

package TOP150;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i]; // Buy at lower price
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        BuySellStocks sol = new BuySellStocks();
        System.out.println(sol.maxProfit(prices)); // Output: 5
    }
}

}
