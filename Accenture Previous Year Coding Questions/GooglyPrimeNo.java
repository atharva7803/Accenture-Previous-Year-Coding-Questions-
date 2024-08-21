/*
Problem Statement 

A number whose sum of digits is prime. 

Input: 43
Output: YES (4+3 = 7)

Input: 123
Output: NO (1+2+3 = 6)

*/


import java.util.*;

public class GooglyPrimeNo{

    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String googlyPrime(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10; 
            sum += lastDigit; 
            n /= 10; 
        }
        if (isPrime(sum)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the decimal number: ");
        int n = sc.nextInt();

        System.out.println("Output: "+ googlyPrime(n));
    }
}
