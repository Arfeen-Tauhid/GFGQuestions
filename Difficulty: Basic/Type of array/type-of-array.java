// User function Template for Java

class Solution {
    int maxNtype(int arr[]) {
        int n = arr.length;
        int ascBreaks = 0, descBreaks = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) ascBreaks++;
            if (arr[i] < arr[i + 1]) descBreaks++;
        }

        // Check if the array is strictly increasing
        if (ascBreaks == 0) return 1;

        // Check if the array is strictly decreasing
        if (descBreaks == 0) return 2;

        // Check for rotated increasing (ascending rotated)
        int rotationPointAsc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) rotationPointAsc++;
        }
        if (rotationPointAsc == 1 && arr[0] > arr[n - 1]) return 4;

        // Check for rotated decreasing (descending rotated)
        int rotationPointDesc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[(i + 1) % n]) rotationPointDesc++;
        }
        if (rotationPointDesc == 1 && arr[0] < arr[n - 1]) return 3;

        // If none of the above
        return -1;
    }
}

