/*

Find count of magical numbers from 1 to N
A number is magical if:
    Convert to binary.
    Replace 0 with 1 and 1 with 2 in binary string.
    Claculate sum of all diits in binary string.
    Resultant must be an odd number

Eg:
    Input: N = 5
    Output: 2

Explanation:
    1 -> Binary = 1  -> convert to = 2   sum = 2 (even)
    2 -> Binary = 10 -> convert to = 21  sum = 3 (odd)
    3 -> Binary = 11 -> convert to = 22  sum = 4 (even)
    4 -> Binary = 100 -> convert to = 211 sum = 4 (even)
    5 -> Binary = 101 -> convert to = 212 sum = 5 (odd)

*/



import java.util.Scanner;

public class MagicalNo {

    public static int Magical(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int zero = 0;

            while (num != 0) {
                if(num % 2 == 0){
                    zero++;
                }
                num = num/2;
            }
            if(zero % 2 == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Output: " + Magical(n));
    }
}
