/*
Implement the following functions.a

char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare

*/


import java.util.*;
public class MoveHyphen {

    public static String MHyphen(String str, int n){
        if (str == null) {
            return null;
        }

        StringBuilder hyphens = new StringBuilder();
        StringBuilder nonHyphens = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '-') {
                hyphens.append('-');
            } else {
                nonHyphens.append(str.charAt(i));
            }
        }

        return hyphens.toString() + nonHyphens.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter string with hypehn: ");
        String str = sc.next ();

        System.out.println ("Result: " + MHyphen(str, str.length()));
    }
}
