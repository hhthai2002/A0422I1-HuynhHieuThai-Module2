package exercise;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        c.setRadius(radius);
        System.out.print("Enter color: ");
        String color = sc.next();
        c.setColor(color);
        System.out.println(c);
        System.out.printf("The area of circle is: %.2f", c.getArea());
    }
}
