//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            long res = obj.subarraySum(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static final int MOD = 1000000007;
    public long subarraySum(int[] arr) {
        long sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            long left = i + 1;
            long right = n - i;


            long contribution = ((arr[i] % MOD) * left % MOD * right % MOD) % MOD;

            sum = (sum + contribution) % MOD;
        }
        return sum;
    }
}
