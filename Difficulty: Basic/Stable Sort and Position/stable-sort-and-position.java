// User function Template for Java

class Solution {
    // Function to get the index of an element in a sorted array
    public int getIndexInSortedArray(int[] arr, int k) {
        int n = arr.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{arr[i], i});
        }
        list.sort(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n; i++) {
            if (list.get(i)[1] == k) {
                return i;
            }
        }
        return -1;
    }
}
