class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            int valA = a[i], valB = b[j];

            if (valA == valB) {
                if (result.isEmpty() || result.get(result.size() - 1) != valA)
                    result.add(valA);
                i++;
                j++;
            } else if (valA < valB) {
                if (result.isEmpty() || result.get(result.size() - 1) != valA)
                    result.add(valA);
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != valB)
                    result.add(valB);
                j++;
            }
        }

        // Add remaining elements of a[]
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
            i++;
        }

        // Add remaining elements of b[]
        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j])
                result.add(b[j]);
            j++;
        }

        return result;
    }
}