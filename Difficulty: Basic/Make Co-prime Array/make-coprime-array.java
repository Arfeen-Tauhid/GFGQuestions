class Solution {

    // Helper function to compute gcd
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int countCoPrime(int[] arr) {
        int insertions = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (gcd(arr[i], arr[i + 1]) != 1) {
                insertions++; // Need to insert at least one number
            }
        }
        
        return insertions;
    }
}