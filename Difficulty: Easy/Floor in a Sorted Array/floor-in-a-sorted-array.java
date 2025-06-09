class Solution {

    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int floorIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                // This could be a floor, move right to find last occurrence
                floorIndex = mid;
                low = mid + 1;
            } else {
                // Move left
                high = mid - 1;
            }
        }

        return floorIndex;
    }
}

