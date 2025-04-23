//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public boolean checkValidity(int a, int b, int c) {
        // code here
        int SumOfTwoSide1 = a+b;
        int SumOfTwoSide2 = b+c;
        int SumOfTwoSide3 = a+c;
        if(SumOfTwoSide1>c && SumOfTwoSide2>a && SumOfTwoSide3>b){
            return true;
        }
        return false;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Solution obj = new Solution();
            if (obj.checkValidity(a, b, c))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends