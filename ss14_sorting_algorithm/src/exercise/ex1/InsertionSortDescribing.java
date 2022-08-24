package exercise.ex1;

import java.util.Scanner;

public class InsertionSortDescribing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    System.out.println("Swap " + a[j] + " with " + a[j - 1]);
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                else {
                    break;
                }
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + "\t");
            }
            System.out.println();
        }
    }
}
