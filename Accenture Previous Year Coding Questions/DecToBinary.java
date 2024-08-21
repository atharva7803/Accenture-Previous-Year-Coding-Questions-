/*
Problem Statement 

Convert decimal no to binary

Input: 10
Output: 1010

*/


import java.util.*;

public class DecToBinary{
    public static String decbin(int n){
        if(n == 0){
            return "0";
        }

        String ans = "";
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = "1" + ans;  
            } else {
                ans = "0" + ans;  
            }
            n = n >> 1;  
        }
        
        
        return ans;
    }

    // return type: int
    public static int decTobin(int n) {
        if (n == 0) {
            return 0;
        }

        int ans = 0;
        int place = 1; // This represents the place value (1, 10, 100, ...)

        while (n > 0) {
            int lastBit = n & 1; // Get the last bit (either 0 or 1)
            ans += lastBit * place; // Add it to the current place value
            place *= 10; // Move to the next place value (1 -> 10 -> 100, etc.)
            n = n >> 1; // Right shift n by 1 (equivalent to n = n / 2)
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
