// User function Template for Java

class Solution {
    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformNeeded++;  // New train arrives, need platform
                maxPlatforms = Math.max(maxPlatforms, platformNeeded);
                i++;
            } else {
                platformNeeded--;  // A train departs, free a platform
                j++;
            }
        }
        return maxPlatforms;
    }
}

