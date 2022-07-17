package exercise;

import java.util.Scanner;

public class MaxElementIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of column in matrix: ");
        int col = sc.nextInt();
        System.out.print("Enter amount of row in matrix: ");
        int row = sc.nextInt();

        int arr[][] = new int[col][row];

        System.out.println("Enter elements of matrix: ");
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++)
                System.out.print(arr[i][j] + "  ");
            System.out.println();
        }
        int maxValue = arr[0][0];
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (arr[j][i] > maxValue) {
                    maxValue = arr[j][i];
                }
            }
        }
        System.out.print("The maximum element is: " + maxValue);
    }
}
