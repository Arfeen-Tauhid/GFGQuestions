import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
            prefixSum.add(sum);
        }
        
        return prefixSum;
    }
}
