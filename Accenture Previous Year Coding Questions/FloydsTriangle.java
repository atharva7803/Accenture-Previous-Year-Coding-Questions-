/*
You have been given an integer N as input . your task is to write a 
program to print N rows of Floyad’s Triangle. Floyd's pattern is a right- 
angled triangular array of natural numbers , used for the numbering of 
lines In a printout 
. 
For N=4, 
1 
23 
456 
78910 

*/



import java.util.Scanner;

public class FloydsTriangle {

    public static void Floyd(int n) {
        int k = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter N:");
        int n = sc.nextInt();

        // Print the Fibonacci series
        Floyd(n);
    }
}
