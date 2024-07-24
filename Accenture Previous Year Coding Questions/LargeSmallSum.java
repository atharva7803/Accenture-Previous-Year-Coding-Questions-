/*
You are required to implement the following Function 

def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:
All array elements are unique
Treat the 0th position as even

NOTE
Return 0 if array is empty
Return 0, if array length is 3 or less than 3

Example

Input
arr:3 2 1 7 5 4

Output
7

Explanation

Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7
Sample Input

arr:1 8 0 2 3 5 6

Sample Output

8

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LargeSmallSum {

    public static int largeSmallSum(int[]arr, int n){
        if (arr == null || n <= 3) {
            return 0;
        }

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size() - 2) + odd.get(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter size of arr: ");
        int n = sc.nextInt ();

        int arr[] = new int[n];
        System.out.println("Enter elements: ");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();

        System.out.println ("Sum: " + largeSmallSum(arr, n));
    }
}
