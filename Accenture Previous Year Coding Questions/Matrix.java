/*
Problem Statement 

You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices

Example

enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Matrix {

    public static void divideArray(int[] main, ArrayList<Integer> even, ArrayList<Integer> odd) {
        for (int i = 0; i < main.length; i++) {
            if (i % 2 == 0) {
                even.add(main[i]);
            } else {
                odd.add(main[i]);
            }
        }
    }

    public static int secondLargest(ArrayList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements to find the second largest");
        }
        return list.get(list.size() - 2);
    }

    public static int sumOfSecondLargestElements(ArrayList<Integer> even, ArrayList<Integer> odd) {
        
        Collections.sort(even);
        Collections.sort(odd);

        System.out.println("Sorted even array ");
        for (int e : even) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("Sorted odd array ");
        for (int e : odd) {
            System.out.print(e + " ");
        }
        System.out.println();

        int evenSec = secondLargest(even);
        int oddSec = secondLargest(odd);

        System.out.println("Second Largest Element in Even List is: " + evenSec);
        System.out.println("Second Largest Element in Odd List is: " + oddSec);

        return evenSec + oddSec;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int arrsize = sc.nextInt();

        int[] main = new int[arrsize];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.println("Enter " + arrsize + " Elements");
        for (int i = 0; i < arrsize; i++) {
            main[i] = sc.nextInt();
        }

        divideArray(main, even, odd);

        int sum = sumOfSecondLargestElements(even, odd);
        System.out.println("Sum Of Second Largest Element Of Odd and Even List: " + sum);
    }
}
