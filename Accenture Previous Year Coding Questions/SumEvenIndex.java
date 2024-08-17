/*
Problem Statement 

Given an array A of length N, find the sum of even positions after reversing the array. Your task is to find and return an integer value represneting sum of the array elements present at the even index of the reveresed array.

input: N = 6, arr = 10,20,30,40,50,60
output: 120

Explanation: reversed array: 60,50,40,30,20,10 and then sum even index(index starting from 0) elements which are 60,40,20

*/


import java.util.*;

public class SumEvenIndex{
    public static int sumEvenIndex(int arr[], int n){
        if(n == 0){
            return 0;
        }
        
        int i = 0, j = n-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        int sum = 0;
        for(int k = 0; k < n; k++){
            if(k % 2 == 0){
                sum += arr[k];
            }
        }
        return sum;
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

        System.out.println("Output: "+ sumEvenIndex(arr, n));
    }
}
