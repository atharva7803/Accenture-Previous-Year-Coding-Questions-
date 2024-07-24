/*
You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.

*/


import java.util.Scanner;
public class AbsoluteDifference {

    public static int AbsDifference(int arr[], int length, int num, int diff){

        int count = 0;
        for(int i = 0; i < length; i++){
            if(Math.abs(num - arr[i]) <= 2){
                count++;
            }
        }

        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter size of arr: ");
        int n = sc.nextInt ();
        
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt ();
        }

        System.out.println("Enter num: ");
        int num = sc.nextInt ();

        System.out.println("Enter difference: ");        
        int diff = sc.nextInt ();

        System.out.println ("Absolute Diff count: " + AbsDifference(arr, n, num, diff));
    }
}
