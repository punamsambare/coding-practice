public class PerfectSquares_279 {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(numSquares(n));
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];

        // Fill with a large value
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

                int square = j * j;

                dp[i] = Math.min(dp[i],
                                 dp[i - square] + 1);
            }
        }

        return dp[n];
    }

}
