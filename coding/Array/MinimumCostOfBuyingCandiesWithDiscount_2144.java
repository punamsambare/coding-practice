import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount_2144 {
    public static void main(String[] args) {
        int[] cost={1,2,3};
        System.out.println(minimumCost(cost));
    }
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int totalCost = 0;

        // Traverse from the most expensive candy
        for (int i = cost.length - 1, count = 1; i >= 0; i--, count++) {
            // Every 3rd candy is free
            if (count % 3 != 0) {
                totalCost += cost[i];
            }
        }

        return totalCost;
    }
}

