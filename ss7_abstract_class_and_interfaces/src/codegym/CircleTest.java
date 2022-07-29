package codegym;

import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        circle.getColor();
        circle.isFilled();
        System.out.println(circle);
        Random r = new Random();
        int percent = 101;
        int resPercent = r.nextInt(percent);
        circle.resize(resPercent);
        System.out.print("A Circle after increased " + resPercent + "% size with radius = " + circle.getRadius() + ", area = " + circle.getArea() + ", perimeter = " + circle.getPerimeter());
        System.out.println();
        circle.howToColor();
    }
}