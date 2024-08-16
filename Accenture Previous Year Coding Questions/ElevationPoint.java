/*
Problem Statement :

Input : N = 7, arr = [1,2,3,4,3,2,1]
Output: 4   

Explanation: 4 is the elevation point

Input: N = 2, arr = [5,3]
Output: 5

*/



import java.util.*;
public class ElevationPoint
{
    public static int elevation(int arr[], int n) {
        if(n == 1) return arr[0];

        if(arr[0] > arr[1]){
            return arr[0];
        }
        if(arr[n-1] > arr[n-2]){
            return arr[n-1];
        }

        int low = 1, high = n-2;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])){
                return arr[mid];
            }
            else if(arr[mid-1] < arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elevation point is: " + elevation(arr, n));
        
    }
} 
