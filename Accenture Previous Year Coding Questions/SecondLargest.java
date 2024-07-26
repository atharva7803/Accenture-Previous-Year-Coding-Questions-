import java.util.Scanner;
public class SecondLargest {

    public static int secondLargest(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 8};
        System.out.println(secondLargest(arr));    
    }   
}