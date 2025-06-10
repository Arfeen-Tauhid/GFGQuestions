class Solution {
    int countStrings(String s) {
        int n = s.length();
        long totalSwaps = (long)n * (n - 1) / 2;
        int[] freq = new int[26];
        boolean hasDuplicate = false;

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] > 1) {
                hasDuplicate = true;
            }
        }

        long duplicateSwaps = 0;
        for (int f : freq) {
            duplicateSwaps += (long)f * (f - 1) / 2;
        }

        long distinct = totalSwaps - duplicateSwaps;

        // If any swap results in the original string, it must be counted
        return (int)(distinct + (hasDuplicate ? 1 : 0));
    }
}
