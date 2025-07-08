
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // If lengths differ, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        // Check if sorted arrays are equal
        return Arrays.equals(a1, a2);
    }
}