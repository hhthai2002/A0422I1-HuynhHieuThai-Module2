package exercise;

import java.util.Scanner;

public class SummaryDiagonalLineCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of column and row in matrix: ");
        int col = sc.nextInt();
        int row = col;

        int arr[][] = new int[col][row];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Enter coordinates of the matrix: ");
        int co = sc.nextInt();
        int sum = 0;
            System.out.println("The diagonal lines are: ");
            for (int i = co; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == i) {
                        sum += arr[i][i];
                        System.out.print(arr[i][i] + "\t");
                    }
                }
            }
            System.out.println();
            System.out.print("The summary of diagonal line is: " + sum);
            System.out.println();
    }
}
