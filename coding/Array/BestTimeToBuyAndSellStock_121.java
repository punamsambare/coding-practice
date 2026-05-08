public class BestTimeToBuyAndSellStock_121 {
   public static void main(String[] args) {
        BestTimeToBuyAndSellStock_121 solver = new BestTimeToBuyAndSellStock_121();

        // Test Case 1: Standard case (Profit = 5)
        int[] example1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test Case 1 Profit: " + solver.maxProfit(example1));

        // Test Case 2: Prices always decreasing (Profit = 0)
        int[] example2 = {7, 6, 4, 3, 1};
        System.out.println("Test Case 2 Profit: " + solver.maxProfit(example2));

        // Test Case 3: Buy low, sell high later
        int[] example3 = {1, 2, 10, 1, 5};
        System.out.println("Test Case 3 Profit: " + solver.maxProfit(example3));
    }

    // The method containing the logic for the problem
    public static int maxProfit(int[] prices) {
        // Handle edge case for empty or single-day arrays
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if current day is cheaper than previous days
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate profit if sold today and update maxProfit if it's the best so far
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

}
