package practice;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        c.setRadius(radius);
        System.out.print("Color of circle: ");
        String color = sc.next();
        c.setColor(color);
        boolean filled = true;
        c.setFilled(filled);
        System.out.println(c);
        System.out.printf("The area of circle is: %.2f and the perimeter of circle is: %.2f", c.getArea(), c.getPerimeter());
    }
}
