/*

Given a string s, find the length of the longest 
substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.


*/


import java.util.*;
public class LongestSubstring {

    public static int Longest(String s){
        Set<Character> set = new HashSet<>();

        int maxLength = 0;
        int start = 0, end = 0;

        while (start < s.length()) {
            if (!set.contains(s.charAt(start))) {
                set.add(s.charAt(start));
                maxLength = Math.max(maxLength, start - end + 1);
                start++;
            } else {
                set.remove(s.charAt(end));
                end++;
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Output: " + Longest(str));

    }
}