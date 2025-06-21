
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();

        // Validate k
        if (k > n || k <= 0) return;

        int firstIndex = k - 1;
        int secondIndex = n - k;

        // Swap the elements
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(secondIndex));
        arr.set(secondIndex, temp);
    }
}

