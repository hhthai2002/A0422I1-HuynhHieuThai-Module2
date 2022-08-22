package practice.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample ex = new ArrayExample();
        Integer[] arr = ex.creatRandom();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter any element: ");
            int x = sc.nextInt();
            try {
                System.out.println("Value of element with index " + x + " is: " + arr[x]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Index is out of array!");
            }
        }
        while (true);
    }
}
