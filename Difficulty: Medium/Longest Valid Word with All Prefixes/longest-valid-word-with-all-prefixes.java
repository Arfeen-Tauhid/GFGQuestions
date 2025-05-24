class Solution {
    public String longestValidWord(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        String result = "";

        // Sort words to ensure lexicographical order
        Arrays.sort(words);

        for (String word : words) {
            boolean isValid = true;
            // Check if all prefixes exist in the set
            for (int i = 1; i < word.length(); i++) {
                String prefix = word.substring(0, i);
                if (!wordSet.contains(prefix)) {
                    isValid = false;
                    break;
                }
            }
            // Update result if valid and longer or lexicographically smaller
            if (isValid) {
                if (word.length() > result.length() ||
                   (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }
        return result;
    }
}