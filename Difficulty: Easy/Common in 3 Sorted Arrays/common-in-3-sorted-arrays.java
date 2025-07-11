class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        int n1 = arr1.size(), n2 = arr2.size(), n3 = arr3.size();

        while (i < n1 && j < n2 && k < n3) {
            int a = arr1.get(i), b = arr2.get(j), c = arr3.get(k);

            // If all elements are equal, add to result
            if (a == b && b == c) {
                result.add(a);

                // Skip duplicates in all arrays
                while (i < n1 && arr1.get(i) == a) i++;
                while (j < n2 && arr2.get(j) == b) j++;
                while (k < n3 && arr3.get(k) == c) k++;
            }
            else {
                // Move the pointer which has the smallest value
                if (a < b) {
                    while (i < n1 && arr1.get(i) == a) i++;
                } else if (b < c) {
                    while (j < n2 && arr2.get(j) == b) j++;
                } else {
                    while (k < n3 && arr3.get(k) == c) k++;
                }
            }
        }

        // If result is empty, return list with -1
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
