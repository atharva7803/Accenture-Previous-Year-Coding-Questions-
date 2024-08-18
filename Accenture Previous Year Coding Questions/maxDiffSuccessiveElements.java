/*
Problem Statement 

Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements return 0;

Input: arr = [3,6,9,1]
Output: 3

*/


import java.util.*;

public class maxDiffSuccessiveElements{
    public static int maxDiff(int arr[], int n){
        if(n < 2){
            return 0;
        }
        Arrays.sort(arr);
        int maxdiff = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            maxdiff = Math.max(maxdiff, (arr[i]-arr[i-1]));
        }
        return maxdiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr: ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Output: "+ maxDiff(arr, n));
    }
}
