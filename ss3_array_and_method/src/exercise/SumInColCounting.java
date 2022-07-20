package exercise;

import java.util.Scanner;

public class SumInColCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of column in matrix: ");
        int col = sc.nextInt();
        System.out.print("Enter amount of row in matrix: ");
        int row = sc.nextInt();

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
        do {
            int sum = 0;
            System.out.print("Enter the number of column that you want to get the summary: ");
            int colIndex = sc.nextInt();
            colIndex -= 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == colIndex) {
                        sum += arr[i][colIndex];
                        System.out.print(arr[i][colIndex] + "\t");
                    }
                }
            }
            System.out.println();
            System.out.print("The summary of column " + (colIndex + 1) + " is: " + sum);
            System.out.println();
        }
        while (true);
    }
}
