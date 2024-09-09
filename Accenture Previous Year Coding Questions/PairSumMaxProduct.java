/*
 
Given Array of size N, We have to return the pair whose sum is equal to target and having maximum product.

Note: First value of pair must be greater than the second value

Input: Target: 18
       N = 8
       arr = [11,1,2,8,10,11,15,7]

Output: [10, 8]  Sum is 18 and product is 80 which is maximum

*/

import java.util.*;

public class PairSumMaxProduct{

    public static void sortDesc(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static int[] PairSum(int n, int arr[], int target){
        int ans[] = new int[2];
        int prod = 0;

        sortDesc(arr);

        int start = 0;
        int end = n-1;


        while(start < end){
            
            int sum = arr[start] + arr[end];

            if(sum == target){
                int currProd = arr[start] * arr[end];
                if(currProd > prod){
                    prod = currProd;
                    ans[0] = arr[start];
                    ans[1] = arr[end];
                }
                start++;
                end--;
            }
            else if(sum < target){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
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

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[] result = PairSum(n, arr, target);
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
