package exercise;

import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D p2 = new Point2D();

        System.out.print("Enter x: ");
        float x = sc.nextFloat();
        p2.setX(x);
        System.out.print("Enter y: ");
        float y = sc.nextFloat();
        p2.setY(y);
        System.out.println("Point2D: " + p2);
    }
}
