/*

Encode the Number: 
You work in the message encoding department of a national security 
message agency. Every message that is sent from or received in your 
office is encoded. You have an integer N and each digit of N is squared 
and the squares are concatenated  together to encode the original 
number. Your task is to find and return an integer value representing 
the encoded value of the number. 

Input Specification: 
input1: An integer value N representing the number to be encoded. 

Explanation: 
Output Specification: 
Return an integer value representing the encoded value of the number.

Example 1: 
input1: 34 
Output: 916 

Here, the given integer is 34, and the square its digit are: 
3^2= 9 
4²=16 

*/



import java.util.Scanner;

public class EncodeNumber {

    public static int Encode(int n) {
        String ans = "";

        while(n != 0){
            int last = n % 10;
            ans = (last*last) + ans;
            n = n / 10; 
        }

        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Encoded number is: " + Encode(n));
    }
}
