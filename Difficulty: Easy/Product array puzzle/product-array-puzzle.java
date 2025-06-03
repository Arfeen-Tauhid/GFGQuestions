// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        // Initialize left and right
        left[0] = 1;
        right[n - 1] = 1;

        // Fill left[]
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        // Fill right[]
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i + 1] * right[i + 1];
        }

        // Construct result
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }

        return res;
    }
}

