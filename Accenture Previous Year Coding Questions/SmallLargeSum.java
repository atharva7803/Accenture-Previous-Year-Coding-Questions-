/*

Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second largest element from the even location with the second largest element from an odd location?
Rules:
a. All the array elements are unique.
b. If the length of the array is 3 or less than 3, then return 0.
c. If Array is empty then return zero.

Sample Test Case 1:
Input:
6
3 2 1 7 5 4
Output:
7

Explanation: The second largest element in the even locations (3, 1, 5) is 3. The second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 4 is 7. So the answer is 7.

Sample Test Case 2:
Input:
7
4 0 7 9 6 4 2
Output:
10

*/




public class SmallLargeSum {
    public static int SmallLargeSum(int[] array) {
        if (array.length <= 3) {
            return 0;
        }

        int firstEven = Integer.MIN_VALUE;
        int secondEven = Integer.MIN_VALUE;
        int firstOdd = Integer.MIN_VALUE;
        int secondOdd = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (array[i] > firstEven) {
                    secondEven = firstEven;
                    firstEven = array[i];
                } else if (array[i] > secondEven) {
                    secondEven = array[i];
                }
            } else {
                if (array[i] > firstOdd) {
                    secondOdd = firstOdd;
                    firstOdd = array[i];
                } else if (array[i] > secondOdd) {
                    secondOdd = array[i];
                }
            }
        }

        return secondEven + secondOdd;
    }

    // Sample test cases
    public static void main(String[] args) {
        int[] array1 = {3, 2, 1, 7, 5, 4};
        System.out.println(SmallLargeSum(array1));  // Output: 7

        int[] array2 = {4, 0, 7, 9, 6, 4, 2};
        System.out.println(SmallLargeSum(array2));  // Output: 10
    }
}
