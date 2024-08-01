/*

You are a given a string str of length n. You have to find the most frequent vowel in the string str
Note: You may assume that str will always hav a unique most frequent vowel.

Sample Test Case:
Input:
7 -> string length
xayuaba

Output:
a

Explanation: As the vowel 'a' occurs the most in the string str, hence 'a' is printed in the output.

*/

import java.util.HashMap;

public class VowelRepetition {

    // Method to find the most frequent vowel in the string
    public static char MostFrequentVowel(String str) {
        HashMap<Character, Integer> vowelCounts = new HashMap<>();
        char mostFrequentVowel = '\0';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCounts.put(ch, vowelCounts.getOrDefault(ch, 0) + 1);

                // Update most frequent vowel if current one has a higher count
                if (vowelCounts.get(ch) > maxCount) {
                    maxCount = vowelCounts.get(ch);
                    mostFrequentVowel = ch;
                }
            }
        }

        return mostFrequentVowel;
    }

    public static void main(String[] args) {
        String str = "xayuaba";
        char result = MostFrequentVowel(str);
        System.out.println("Most Frequent vowel is: "+result);  // Output: a
    }
}
