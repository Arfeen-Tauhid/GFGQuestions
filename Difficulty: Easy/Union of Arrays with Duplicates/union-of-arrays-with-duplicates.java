class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        // Add all elements from array a
        for (int num : a) {
            set.add(num);
        }

        // Add all elements from array b
        for (int num : b) {
            set.add(num);
        }

        // Convert set to ArrayList
        ArrayList<Integer> result = new ArrayList<>(set);
        
        // Optional: sort the result (driver code might do this)
        Collections.sort(result);

        return result;
    }
}