class Solution {
    public int countFibonacciNumbers(long[] arr) {
        // Step 1: Generate Fibonacci numbers up to 100000
        Set<Long> fibSet = new HashSet<>();
        long a = 0, b = 1;
        while (a <= 100000) {
            fibSet.add(a);
            long temp = a + b;
            a = b;
            b = temp;
        }

        // Step 2: Count how many numbers in arr are in the fibSet
        int count = 0;
        for (long num : arr) {
            if (fibSet.contains(num)) {
                count++;
            }
        }

        return count;
    }
}
