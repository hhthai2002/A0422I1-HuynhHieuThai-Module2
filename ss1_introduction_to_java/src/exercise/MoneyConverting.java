package exercise;

import java.util.Scanner;

public class MoneyConverting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount (USD): ");
        int rate = 23000;
        float usd = sc.nextFloat();
        System.out.println("Converting to VND is: " + usd * rate + " VND");
    }
}
