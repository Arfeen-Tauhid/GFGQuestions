class Solution {
    int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = maxEndingHere;

            maxEndingHere = Math.max(arr[i], Math.max(arr[i] * maxEndingHere, arr[i] * minEndingHere));
            minEndingHere = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minEndingHere));

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
