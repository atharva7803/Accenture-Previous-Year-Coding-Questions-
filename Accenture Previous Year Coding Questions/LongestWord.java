/*

Rohan is a kid who has just learned about creating words from 
alphabets. He has written some words in the notepad of his Father 
laptop. Now his father wants to find the longest word written by Rohan 
using a computer program. Write a program to find the longest string 
in a given list of strings. 

Example: 
Input: yes no number 
Output: The longest string is: number

*/



import java.util.Scanner;

public class LongestWord {

    public static String longestWord(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String arr[] = s.split(" ");

        int max = 0;
        String longest = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                longest = arr[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter string:");
        String s = sc.nextLine();

        System.out.println("The longest string is: " + longestWord(s));
    }
}
