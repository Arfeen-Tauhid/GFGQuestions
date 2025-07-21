class Solution {
    public String frequencySort(String s) {
        // Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Create a list of characters
        List<Character> charList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            charList.add(ch);
        }

        // Sort the list based on frequency and lexicographical order
        Collections.sort(charList, (a, b) -> {
            int freqCompare = freqMap.get(a).compareTo(freqMap.get(b));
            if (freqCompare != 0)
                return freqCompare;  // Increasing frequency
            return Character.compare(a, b);  // Lexicographical order
        });

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char ch : charList) {
            result.append(ch);
        }

        return result.toString();
    }
}
