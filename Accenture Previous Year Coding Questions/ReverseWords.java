/*

Input: 
A single line of text containing words separated by spaces. The input string consists of only printable ASCII characters. 

Output: 
The string with words reversed in order. 

Example: 
Input: Hello 
World 

Output: 
World Hello

*/


import java.util.*;

public class ReverseWords{

    public static void reverseWord(String s){

        String[] words = s.split(" ");

        String reversedString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i];
            if (i != 0) {
                reversedString += " "; // Add space between words
            }
        }

        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s=sc.nextLine(); 

        reverseWord(s);
    }
}