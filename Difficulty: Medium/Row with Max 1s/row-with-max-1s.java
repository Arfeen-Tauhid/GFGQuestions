class Solution {
    public int findMax1sRow(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int maxRowIndex = -1;
        int j = m - 1;  // start from top-right
        for (int i = 0; i < n; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j--; // move left while we see 1s
                maxRowIndex = i; // update row index with max 1s
            }
        }
        
        return maxRowIndex == -1 ? 0 : maxRowIndex;
    }
}
