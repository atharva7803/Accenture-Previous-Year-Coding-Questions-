/*
    
Given an integer N and string S. your task is to find and return new String which consist of the original string repeated N times.

Input: N = 3, S = "abc"
Output: "abcabcabc"

*/

import java.util.*;
public class RepeateString {

    public static String repeate(String str, int n){
        String repeate = "";
        while(n > 0){
            repeate += str;
            n--;
        }
        return repeate;
    }


    public static void main(String[] args) {
        String str = "abc";
        int n = 3;
        System.out.println(repeate(str, n));
    }
}