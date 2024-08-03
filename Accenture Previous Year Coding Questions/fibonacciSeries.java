/*
Problem Statement :

Print the fibonacci series.

*/



import java.util.Scanner;

public class fibonacciSeries {

    // Function to print the Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        // Print the Fibonacci series
        printFibonacciSeries(n);
    }
}
