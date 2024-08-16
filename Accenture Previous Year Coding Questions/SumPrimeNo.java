
/*
Problem Statement :

Write a function that takes an integer n as input and returns the sum of all prime numbers less than N.

Input: 10
Output: 17

Explanation: prime no less than 10 are: 2, 3, 5, 7 

*/



import java.util.*;
public class SumPrimeNo
{
    public static int sumPrime(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } 
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                sum += i;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Output: " + sumPrime(n));
        
    }
} 

