// User function Template for Java

class Complete {

    public static String Sandwiched_Vowel(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);

            if (isVowel(current)) {
                boolean isSandwiched = false;
                if (i > 0 && i < n - 1) {
                    char prev = str.charAt(i - 1);
                    char next = str.charAt(i + 1);
                    if (!isVowel(prev) && !isVowel(next)) {
                        isSandwiched = true;
                    }
                }

                if (!isSandwiched) {
                    result.append(current);
                }

            } else {
                result.append(current);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

