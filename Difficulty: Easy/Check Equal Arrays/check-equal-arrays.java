// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Check if lengths are equal (not really necessary if given, but safe)
        if (a.length != b.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare each element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}