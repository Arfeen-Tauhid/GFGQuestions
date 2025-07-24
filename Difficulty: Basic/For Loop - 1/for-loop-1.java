import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Take input

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i);
            if (i < 10) {
                System.out.print(" "); // Add space after each number except the last
            }
        }
    }
}
