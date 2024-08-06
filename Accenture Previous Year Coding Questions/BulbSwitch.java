/*
Problem Statement :

N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an inital state of all bulbs, Find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.

Note: A[] = [0 1 0 1]
Output: 4

Explanation:
Press switch 0: [1 0 1 0] //1
Press switch 1: [1 1 0 1] //2
Press switch 2: [1 1 1 0] //3
Press switch 3: [1 1 1 1] //4

Input: A[] = [1 0 0 0 0]
Output: 1

*/



import java.util.*;
public class BulbSwitch
{
    public static int BulbSwitch(int arr[], int n)
    {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                for(int j = i+1; j < n; j++){
                    if(arr[j] == 1){
                        arr[j] = 0;
                    }else{
                        arr[j] = 1;
                    }
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {0,1,0,1};
        int n = arr.length;

        System.out.println("Minimum no of switches to press: " + BulbSwitch(arr, n));
    }
} 
