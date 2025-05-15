//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline
        while (t-- > 0) {
            String input1 = sc.nextLine();
            String[] inputStrings1 = input1.split(" ");
            int[] arr1 = new int[inputStrings1.length];
            for (int i = 0; i < inputStrings1.length; i++) {
                arr1[i] = Integer.parseInt(inputStrings1[i]);
            }

            String input2 = sc.nextLine();
            String[] inputStrings2 = input2.split(" ");
            int[] arr2 = new int[inputStrings2.length];
            for (int i = 0; i < inputStrings2.length; i++) {
                arr2[i] = Integer.parseInt(inputStrings2[i]);
            }

            Solution ob = new Solution();
            long ans = ob.findMultiplication(arr1, arr2);
            System.out.println(ans);
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        // Find max in arr1
        for (int num : arr1) {
            if (num > max1) {
                max1 = num;
            }
        }

        // Find min in arr2
        for (int num : arr2) {
            if (num < min2) {
                min2 = num;
            }
        }

        // Return product
        return (long) max1 * min2;
    }
}
