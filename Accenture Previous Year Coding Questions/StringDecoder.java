/*

Problem Statement 

You are provided with a string which has a sequence of 1s and Os. This sequence is the encoded version of a english word. You are supposed to write a program to decode the provided string and find the original word. Each uppercase Alphabet is representing by a sequence of 1s

Input: 10110111
Output: ABC

Explanation: 1 0 1 1 0 1 1 1
             A    B      C



*/


import java.util.*;
public class StringDecoder {

    static String Decoder(String s){
        if (s.length() == 0 || s.charAt(0) == '0') {
            return ""; 
        }
        
        String ans = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                ans += (char)('A' + count - 1);
                count = 0;
            }
        }
        ans += (char)('A' + count - 1);
        return ans;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Output: " + Decoder(str));

    }
}