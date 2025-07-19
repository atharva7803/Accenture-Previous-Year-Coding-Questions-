/*
Problem Statement 

Given an m * n integer matrix , if an element is 0, set its entire row and column to 0.

Input: matrix = [[1,1,1],
                 [1,0,1],
                 [1,1,1]]

Output: matrix = [[1,0,1],
                  [0,0,0],
                  [1,0,1]]

*/


import java.util.*;

public class SetZeroMatrix{
    public static void setZero(int matrix[][]){
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        HashSet<Integer> rowset=new HashSet<>();
        HashSet<Integer> colset=new HashSet<>();

        for(int i = 0; i < rowlen; i++){
            for(int j = 0; j < collen; j++){
                if(matrix[i][j] == 0){
                    rowset.add(i);
                  colset.add(j);
                }
            }
        }

        for(int i = 0; i < rowlen; i++){
            for(int j = 0; j < collen; j++){
                if(rowset.contains(i) || colset.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of row : ");
        int row = sc.nextInt();

        System.out.print("Enter no of col : ");
        int col = sc.nextInt();

        System.out.println("Enter elements: ");
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZero(matrix);

        System.out.println("Output matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
