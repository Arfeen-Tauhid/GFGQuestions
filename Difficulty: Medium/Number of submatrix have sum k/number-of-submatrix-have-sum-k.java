class Solution {
    public int countSquare(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] prefixSum = new int[n + 1][m + 1];

        // Build Prefix Sum Matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefixSum[i][j] = mat[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1]
                                - prefixSum[i - 1][j - 1];
            }
        }

        int count = 0;

        // Iterate over all possible square sizes
        int maxSize = Math.min(n, m);
        for (int size = 1; size <= maxSize; size++) {
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {
                    int total = getSum(prefixSum, i, j, i + size - 1, j + size - 1);
                    if (total == x) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private int getSum(int[][] prefixSum, int r1, int c1, int r2, int c2) {
        r1++; c1++; r2++; c2++;  // Convert to 1-based index
        return prefixSum[r2][c2]
             - prefixSum[r1 - 1][c2]
             - prefixSum[r2][c1 - 1]
             + prefixSum[r1 - 1][c1 - 1];
    }
}
