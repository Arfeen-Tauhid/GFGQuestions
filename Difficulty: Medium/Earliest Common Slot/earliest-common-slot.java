import java.util.*;

class Solution {
    public int[] commonSlot(List<int[]> slots1, List<int[]> slots2, int d) {
        // Sort both lists by start time
        slots1.sort(Comparator.comparingInt(a -> a[0]));
        slots2.sort(Comparator.comparingInt(a -> a[0]));

        int i = 0, j = 0;

        while (i < slots1.size() && j < slots2.size()) {
            int start = Math.max(slots1.get(i)[0], slots2.get(j)[0]);
            int end = Math.min(slots1.get(i)[1], slots2.get(j)[1]);

            // If there's enough overlap
            if (end - start >= d) {
                return new int[]{start, start + d};
            }

            // Move the pointer with the smaller end time
            if (slots1.get(i)[1] < slots2.get(j)[1]) {
                i++;
            } else {
                j++;
            }
        }

        return new int[]{}; // No common slot found
    }
}
