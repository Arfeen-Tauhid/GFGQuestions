
import java.util.HashMap;

class Solution {
    int maxLen(int arr[]) {
        // Map to store (prefix_sum -> first_index)
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: Subarray from index 0 to i has 0 sum
            if (sum == 0) {
                maxLength = i + 1;
            }

            // Case 2: If sum is seen before, update maxLength
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                // Store sum with first occurrence index
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
