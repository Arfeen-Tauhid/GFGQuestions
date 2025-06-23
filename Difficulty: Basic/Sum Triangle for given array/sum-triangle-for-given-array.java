class Solution {
    static final int MOD = 1000000007;

    public ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> lastRow = new ArrayList<>();
        for (int num : arr) {
            lastRow.add(num);
        }
        triangle.add(lastRow);

        while (lastRow.size() > 1) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int i = 0; i < lastRow.size() - 1; i++) {
                newRow.add((lastRow.get(i) + lastRow.get(i + 1)) % MOD);
            }
            triangle.add(0, newRow); // insert at beginning to build top to bottom
            lastRow = newRow;
        }

        // Flatten the triangle
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> row : triangle) {
            result.addAll(row);
        }
        return result;
    }
}