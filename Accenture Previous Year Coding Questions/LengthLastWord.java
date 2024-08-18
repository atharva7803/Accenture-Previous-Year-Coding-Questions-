/*
Problem Statement 

Given a string S consisting of words and spaces, return the lenght of the last word in the string.

Input: "  I am  a passionate   Developer  "
Output: 9

*/


import java.util.*;

public class LengthLastWord{
    public static int LengthLast(String s){
        String arr[] = s.split(" ");
        
        int n = arr.length;
        String s1 = arr[n-1];

        return s1.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = sc.nextLine();

        System.out.println("Output: "+ LengthLast(s));
    }
}
