/*
Problem Statement :

You are given a function, void MaxInArray(int arr[], int length); The function accepts an integer array ‘arr’ of size ‘length’ as its argument. Implement the function to find the maximum element of the array and print the maximum element and its index to the standard output 

(STDOUT). The maximum element and its index should be printed in separate lines.

Note: 

Array index starts with 0 
Maximum element and its index should be separated by a line in the output 
Assume there is only 1 maximum element in the array 
Print exactly what is asked, do not print any additional greeting messages 
Example: 

Input: 
23 45 82 27 66 12 78 13 71 86 

Output: 
86 

9 

Explanation: 
86 is the maximum element of the array at index 9. 

*/



import java.util.*;
public class Maximum
{
    public static void MaxIndElement(int arr[], int length) 
    {
        int max = arr[0], index = 0;
        for (int i = 0; i < length; i++){
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println (max);
        System.out.println (index);
    }

    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt ();

        int arr[] = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();

        System.out.println("Maximum element with its index is: "); 
        MaxIndElement(arr, arr.length);
    } 
} 
