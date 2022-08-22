package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIllegal checkIllegal = new CheckIllegal();
        double x, y, z;
        do {
            System.out.print("Enter side x: ");
            x = sc.nextDouble();
            System.out.print("Enter side y: ");
            y = sc.nextDouble();
            System.out.print("Enter side z: ");
            z = sc.nextDouble();

            while (true) {
                try {
                    if (checkIllegal.checkSides(x, y, z)) {
                        break;
                    }
                } catch (IllegalTriangleException e) {
                    System.err.println(e.getMessage());
                    System.out.println();
                    System.out.print("Enter side x again: ");
                    x = sc.nextDouble();
                    System.out.print("Enter side y again: ");
                    y = sc.nextDouble();
                    System.out.print("Enter side z again: ");
                    z = sc.nextDouble();
                }
            }
        }
        while (true);
    }
}
