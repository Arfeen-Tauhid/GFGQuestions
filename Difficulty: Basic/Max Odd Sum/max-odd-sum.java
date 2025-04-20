//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            String[] input = reader.readLine().trim().split("\\s+");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            System.out.println(ob.findMaxOddSum(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxOddSum(int[] arr) {
        int sum = 0;
        int smallestOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }

            if (Math.abs(num) % 2 == 1) {
                hasOdd = true;
                smallestOdd = Math.min(smallestOdd, Math.abs(num));
            }
        }

        if (!hasOdd) return -1;

        if (sum % 2 == 1) {
            return sum;
        } else {
            return sum - smallestOdd;
        }
    }
}
