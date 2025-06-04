// User function Template for Java

class Solution {
    public ArrayList<Integer> countArray(int[] arr, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int avg = (arr[i] + x) / 2;
            result.add(freqMap.getOrDefault(avg, 0));
        }

        return result;
    }
}
