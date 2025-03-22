//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int date = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int car[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                car[i] = Integer.parseInt(inputLine[i]);
            }

            String inputLine2[] = br.readLine().trim().split(" ");
            int n2 = inputLine.length;
            int fine[] = new int[(int)(n2)];
            for (int i = 0; i < n2; i++) {
                fine[i] = Integer.parseInt(inputLine2[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.totalFine(date, car, fine));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long totalFine(int date, int car[], int fine[]) {
        long sum = 0; 
        
        if ((date % 2) == 0) {
            for (int i = 0; i < car.length; i++) {
                if (car[i] % 2 == 1) { 
                    sum += fine[i];
                }
            }
        } else {
            for (int i = 0; i < car.length; i++) {
                if (car[i] % 2 == 0) { 
                    sum += fine[i];
                }
            }
        }
        return sum;
    }
}
