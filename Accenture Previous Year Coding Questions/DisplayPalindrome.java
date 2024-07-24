/*
Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DisplayPalindrome {

    public static int palindrome (int no1)
    {
        int rem = 0;
        int div = no1;
        while (div != 0)
        {
	        int r = div % 10;
	        rem = (rem * 10) + r;
	        div = div / 10;
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter Upper and Lower Limit");
        int ul = sc.nextInt ();
        int ll = sc.nextInt ();
        
        for (int i = ul; i <= ll; i++){
	        if (i == palindrome (i))
                System.out.print(i+" ");
        }
    }
}
