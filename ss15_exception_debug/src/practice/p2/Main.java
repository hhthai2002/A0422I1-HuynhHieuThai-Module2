package practice.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");
            int y = sc.nextInt();

            CalculationExample cal = new CalculationExample();
            cal.calculate(x, y);
        }
        while (true);
    }
}
