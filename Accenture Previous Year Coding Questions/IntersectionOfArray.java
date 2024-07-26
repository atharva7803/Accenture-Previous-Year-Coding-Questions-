import java.util.*;
public class IntersectionOfArray {

    public static List<Integer> Intersection(int arr1[], int arr2[]){
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        List<Integer> result = Intersection(arr1, arr2);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}