package exercise;

import java.util.Scanner;

public class ArrayMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the element " + (i + 1) + " of Array 1: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter amount of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the element " + (i + 1) + " of Array 2: ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n1 + n2];
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.print("The array after merged is: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
    }
}
