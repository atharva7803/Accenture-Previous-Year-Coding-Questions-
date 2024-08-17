/*
Problem Statement 

Alice has a collection of songs represented as a string S where each character reperesents a song. Aplaylisy is the substring of the given string with exactly K number of songs. She wants to create a playlist that contains maximum number of her favourite song which is 'a'. Your task is to find and return an integer value representing the maximum number of favourite songs that she can get in a single playlist.

Input: S = "acdbaaca"
       K = 3

Output: 2

Explanation: Substring of S of size 3: {"acd", "cdb", "dba", "baa", "aac", "aca"} 

So "a" is coming max 2 times in substring

*/


import java.util.*;

public class MaxFavouriteSong{
    public static int MaxSong(String s, int k){
        int max = 0;
        int count = 0;

        int i = 0;
        int j = -1;

        int n = s.length();
        char arr[] = s.toCharArray();

        for (j = 0; j < k; j++) {
            if (arr[j] == 'a') {
                count++;
            }
        }

        max = count; 

        for (j = k; j < n; j++) {
            if (arr[i] == 'a') {
                count--;
            }
            i++;

            if (arr[j] == 'a') {
                count++;
            }
            max = Math.max(max, count);
        }     

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = sc.nextLine();

        System.out.println("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Output: "+ MaxSong(s, k));
    }
}
