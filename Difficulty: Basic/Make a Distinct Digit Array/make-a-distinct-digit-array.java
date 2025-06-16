// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        Set<Integer> digitSet = new HashSet<>();
        
        for (int num : nums) {
            while (num > 0) {
                digitSet.add(num % 10);
                num /= 10;
            }
        }
        
        List<Integer> digitList = new ArrayList<>(digitSet);
        Collections.sort(digitList);
        
        int[] result = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            result[i] = digitList.get(i);
        }
        
        return result;
    }
}