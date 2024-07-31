/*

GIven an array, find the number of occurences of each element in the array.

Sample Test Case 2:
Input:
arr[] = {10,5,10,15,10,5}

Output:
10 - 3
5 - 2
15 - 1

*/

import java.util.HashMap;

public class ElementOccurences {
    public static HashMap<Integer, Integer> Occurence(int[] array) {
        HashMap<Integer, Integer> occu = new HashMap<>();

        for(int elem : array){
            if(occu.containsKey(elem)){
                occu.put(elem, occu.get(elem) + 1);
            }
            else{
                occu.put(elem, 1);
            }
        }
        return occu;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer> result = Occurence(arr);

        for (int key : result.keySet()) {
            System.out.println(key + " - " + result.get(key));
        }
    }
}
