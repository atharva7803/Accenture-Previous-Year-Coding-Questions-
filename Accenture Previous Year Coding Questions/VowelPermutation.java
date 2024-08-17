/*
Problem Statement 

You are given a string S and your task is to find and return the count of permutation formed by fixing the positions of the vowels present in the string.

Input: ABC
Output: 2

Explanation: A will be constant, and remaining 2 will return their permutation which is factorial of 2

*/


import java.util.*;

public class VowelPermutation{

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 1;
        for(int i = 2; i <= n; i++){
            ans *= i;
        }
        return ans;
    }

    public static int permutation(String s){
        HashSet<Character> vowels = new HashSet<>();

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int nonVowelCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                nonVowelCount++;
            }
        }
        return factorial(nonVowelCount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = sc.nextLine();

        System.out.println("Output: "+ permutation(s));
    }
}
