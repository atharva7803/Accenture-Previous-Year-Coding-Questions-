/*
Problem Statement 

You are working on a financial analysing tool which repersents daily stock price of a company over time Each element in an integer array A of size N reperesnts the closing price of the stock for that particular day. Your task is to find and return an integer value representing the total number of days where the stock marke price decreased indicating negative growth.

Input: N = 6, A[] = {2,3,1,4,5,2}
Output: 2

Input: N = 1, A[] = {6}
Output: 0

*/


import java.util.*;

public class NegativeStockPrice{
    public static int CountNegativePrice(int arr[], int N){
        int count = 0;

        if(N <= 1){
            return 0;
        }

        for(int i = 0; i < N-1; i++){
            if(arr[i+1] < arr[i]){
                count++;
            }
        }
        return count;
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

        System.out.println("Output: "+ CountNegativePrice(arr, n));
    }
}
