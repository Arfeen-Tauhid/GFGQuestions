//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

import java.util.HashMap;

class Solution {
    public int findUnique(int k, int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}



//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim());
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.findUnique(k, arr));
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends