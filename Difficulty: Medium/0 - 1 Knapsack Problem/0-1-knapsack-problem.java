class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        // dp[i][w] = max value with first i items and weight limit w
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        val[i - 1] + dp[i - 1][w - wt[i - 1]], // take the item
                        dp[i - 1][w]                            // don't take the item
                    );
                } else {
                    dp[i][w] = dp[i - 1][w]; // item can't be included
                }
            }
        }

        return dp[n][W];
    }
}
