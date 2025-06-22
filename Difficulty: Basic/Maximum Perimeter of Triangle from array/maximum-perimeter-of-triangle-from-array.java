
class Solution {
    public int maxPerimeter(int[] arr) {
        Arrays.sort(arr); // Sort in ascending order

        // Traverse from end to find first valid triangle
        for (int i = arr.length - 1; i >= 2; i--) {
            int a = arr[i], b = arr[i - 1], c = arr[i - 2];
            if (b + c > a) {
                return a + b + c;
            }
        }

        return -1; // No valid triangle found
    }
}
