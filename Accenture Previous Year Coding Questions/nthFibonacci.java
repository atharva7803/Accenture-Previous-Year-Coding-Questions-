/*
Problem Statement 

Given input as n, find nth fibonacci series number.

Fibonacci series example is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...

Input: 9
Output: 34 (At 9th index number is 34)

*/


import java.util.*;

public class nthFibonacci{
    public static int nthFib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int a = 0, b = 1;
        int c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index to find number of fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Output: "+ nthFib(n));
    }
}
