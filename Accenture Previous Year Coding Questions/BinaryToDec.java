/*
Problem Statement 

Convert binary no to decimal

Input: 1010
Output: 10

*/


import java.util.*;

public class BinaryToDec{
    public static int decTobin(int n) {
        if (n == 0) {
            return 0;
        }

        int ans = 0;
        int base = 1; // This represents the place value (1, 10, 100, ...)

        while (n > 0) {
            int lastBit = n % 10; // Get the last bit (either 0 or 1)
            ans += lastBit * base; // Add it to the current base value
            base *= 2; // Move to the next place value (1 -> 10 -> 100, etc.)
            n /= 10; // Right shift n by 1 (equivalent to n = n / 2)
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the decimal number: ");
        int n = sc.nextInt();

        System.out.println("Output: "+ decTobin(n));
    }
}
