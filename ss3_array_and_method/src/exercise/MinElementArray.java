package exercise;

import java.util.Scanner;

public class MinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int minValue = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.print("The minimum element in array is: " + minValue);
    }
}
