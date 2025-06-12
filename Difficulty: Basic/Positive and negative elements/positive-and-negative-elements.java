// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = positive.size();
        for (int i = 0; i < n; i++) {
            result.add(positive.get(i));
            result.add(negative.get(i));
        }
        
        return result;
    }
}

