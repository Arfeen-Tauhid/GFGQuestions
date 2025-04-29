//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        for(int i = 0; i < mat.length; i++) { // loop through rows
            for(int j = 0; j < mat[i].length; j++) { // loop through columns
                if(mat[i][j] == x) {
                    return true; // x found
                }
            }
        }
        return false; // x not found
    }
}
