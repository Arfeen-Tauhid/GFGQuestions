class Solution {
    public void sumArray(List<Integer> arr) {
        // Your Code goes here
                int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        // Replace each element with totalSum - current element
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, totalSum - arr.get(i));
        }
    }
}