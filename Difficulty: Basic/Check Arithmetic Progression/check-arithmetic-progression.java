//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
    int n = arr.length;
        if (n <= 1) return true;
        Arrays.sort(arr);
         int d = arr[1] - arr[0];
                 for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
        }
    }
        return true;
    }
}


//{ Driver Code Starts.

// Driver class
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String inputLine = sc.nextLine().trim();
            String[] inputArray = inputLine.split("\\s+");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            boolean ans = ob.checkIsAP(arr);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends