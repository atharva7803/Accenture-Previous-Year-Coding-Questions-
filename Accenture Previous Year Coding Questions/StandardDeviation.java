import java.util.*;
public class StandardDeviation {

    public static double SD(List<Integer> arr){
        
        int n = arr.size();
        double avg = 0;
        double sum = 0;
        

        for(int i = 0; i < n; i++){
            sum += arr.get(i);
        }
        avg = sum / n;

        double sumOfSquare = 0;
        for(int i = 0; i < n; i++){
            sumOfSquare += Math.pow(arr.get(i) - avg, 2);
        }

        double sd = Math.sqrt(sumOfSquare / n);
        return sd;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(SD(arr));
    }
}