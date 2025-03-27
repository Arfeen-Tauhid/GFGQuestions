//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int calculateFriendliness(int[] arr) {
        // code here
int sum = 0; // Initialize sum to 0

        for (int i = 1; i < arr.length; i++) {
            sum += Math.abs(arr[i] - arr[i - 1]);
        }

        sum += Math.abs(arr[arr.length - 1] - arr[0]);
        return sum;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                arr[j] = Integer.parseInt(inputArray[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.calculateFriendliness(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends