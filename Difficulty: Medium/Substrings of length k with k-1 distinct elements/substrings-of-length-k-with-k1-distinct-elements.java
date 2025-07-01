class Solution {
    public int substrCount(String s, int k) {
        if (k > s.length()) return 0;
        
        int count = 0;
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // Add character at right end of window
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
            
            // Shrink window if size exceeds k
            if (i >= k) {
                char toRemove = s.charAt(i - k);
                freqMap.put(toRemove, freqMap.get(toRemove) - 1);
                if (freqMap.get(toRemove) == 0) {
                    freqMap.remove(toRemove);
                }
            }

            // When window size is exactly k
            if (i >= k - 1) {
                if (freqMap.size() == k - 1) {
                    count++;
                }
            }
        }

        return count;
    }
}