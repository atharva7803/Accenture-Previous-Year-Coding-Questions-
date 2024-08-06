/*
Problem Statement :

Print the first K words of the string.

Input: Hello I am a passionate developer
       k = 4

Output: Hello I am a

*/



import java.util.Scanner;

public class FirstKWords {

    public static String firstKWords(String str,int k) {
        String words[] = str.split("\\s+");

        if(k > words.length){
            return str;
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < k; i++){
            result.append(words[i]);
            if(i < k-1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        // Input the number of terms
        System.out.println("Enter value of K:");
        int k = sc.nextInt();

        // Print the Fibonacci series
        System.out.println("The first K words are: "+ firstKWords(str,k));
    }
}
