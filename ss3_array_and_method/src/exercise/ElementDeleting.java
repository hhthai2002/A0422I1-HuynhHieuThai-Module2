package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ElementDeleting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element that you want to delete: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if (arr[i] == x) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                System.out.print("The array after deleted element: " + Arrays.toString(arr));
                break;
            }
        }

    }

}
