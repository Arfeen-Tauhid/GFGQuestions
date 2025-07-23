class Solution {
    public static int[] rowSum(int mat[][]) {
        int n = mat.length;       // number of rows
        int m = mat[0].length;    // number of columns
        int[] result = new int[n]; // array to store row sums

        // Iterate over each row
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Iterate over each column in the current row
            for (int j = 0; j < m; j++) {
                sum += mat[i][j];
            }
            result[i] = sum; // Store sum of current row
        }

        return result;
    }

    // Sample test
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result1 = rowSum(mat1);
        printArray(result1); // Output: 6 15 24

        int[][] mat2 = {{1, 2}, {10, 2}, {3, 3}};
        int[] result2 = rowSum(mat2);
        printArray(result2); // Output: 3 12 6
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
