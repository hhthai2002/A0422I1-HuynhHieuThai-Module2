package practice;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        rec.setWidth(w);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        rec.setLength(l);
        System.out.print("Color of the rectangle: ");
        String color = sc.next();
        rec.setColor(color);
        boolean filled = false;
        rec.setFilled(filled);
        System.out.println(rec);
        System.out.print("The rectangle is " + color);
        System.out.println();
        System.out.printf("The area of rectangle is: %.2f and the perimeter of rectangle is: %.2f", rec.getArea(), rec.getPerimeter());
    }
}
