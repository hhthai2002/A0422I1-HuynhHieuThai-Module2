package exercise;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        s.setSide1(side1);
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        s.setSide2(side2);
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();
        s.setSide3(side3);
        System.out.print("Enter color: ");
        String color = sc.next();
        s.setColor(color);
        System.out.println(s);
    }
}
