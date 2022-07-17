package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ElementAdding {

    public static int[] add(int n, int[] arr, int element, int index){
        int newArr[] = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            if(i < index - 1){
                newArr[i] = arr[i];
            }
            else if(i == index - 1) {
                newArr[i] = element;
            }
            else{
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element that you want to add: ");
        int element = sc.nextInt();
        System.out.print("Enter the index that you want to add: ");
        int index = sc.nextInt();

        if(index <= 0 || index >= arr.length + 2){
            System.out.print("Can not add your element into the array!");
        }
        else{
            arr = add(n, arr, element, index);
            System.out.print("The array after added element: " + Arrays.toString(arr));
        }
    }

}
