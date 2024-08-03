/*
Problem Statement :

Given the function accepts an integer arr of size n as its argument. The function needs to return the index of equiibrium point int ht array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. If no equilibrium point exists, the function should return -1.

Input arr: {3,4,3,1,6}
Output: 2   

Explanation: 3+4 = 7 and 1+6 = 7 so 3 is the equilibrium point having index 2.

*/



import java.util.*;
public class EquilibriumSum
{
    public static int equilibrium(int arr[]) 
    {
        int n = arr.length;
        int leftsum = 0, rightsum = 0;
        int total = 0;

        for(int i = 0; i < n; i++) {
            total += arr[i];
        }
        for(int i = 0; i < n; i++){
            rightsum = total - arr[i] - leftsum;
            if(leftsum == rightsum){
                return i;
            }
            leftsum += arr[i];
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

        System.out.println("Equilibrium Index is: " + equilibrium(arr));
        
    }
} 
