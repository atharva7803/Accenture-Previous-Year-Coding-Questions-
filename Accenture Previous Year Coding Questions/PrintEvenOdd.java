/*
Problem Statement 

Jack has an array of lenght N. He Wants to label whether the number in the array is even of odd. Your taks is to help find and return a string with labels even or odd in sequence according to which the numbers appear in the array.

Input: N = 6
arr = [1, 2, 3, 4, 5, 6]

Output: "odd even odd even odd even"

*/


import java.util.*;

public class PrintEvenOdd{
    public static String EvenOdd(int arr[], int n){
        if(n == 0){
            return "";
        }
        String result = "";
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                result += "even ";
            }
            else{
                result += "odd ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output: "+ EvenOdd(arr, n));
    }
}
