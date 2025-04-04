//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            int x = Integer.parseInt(sc.nextLine()); // consume the newline
            int[] ans = new Solution().getMoreAndLess(arr, x);
            System.out.println(ans[0] + " " + ans[1]);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int count1 = 0;
        int count2 = 0;
        int arr1[] = new int[2];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<target){
                ++count1;
            }else if(arr[i]==target){
                ++count1;
                ++count2;
            }else if(arr[i]>target){
                ++count2;
            }
        }
            arr1[0] = count1;
            arr1[1] = count2;
            
            return arr1;
    }
}