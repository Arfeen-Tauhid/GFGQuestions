class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Loop through each element and decrement by 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1;
        }
        return arr;
    }
}
