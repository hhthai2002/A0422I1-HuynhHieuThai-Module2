package codegym;

import java.util.Random;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        rectangle.getColor();
        rectangle.isFilled();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        rectangle.setWidth(width);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        rectangle.setLength(length);
        System.out.println(rectangle);
        Random r = new Random();
        int percent = 101;
        int resPercent = r.nextInt(percent);
        rectangle.resize(resPercent);
        System.out.print("A Rectangle after increased " + resPercent + "% size with width = " + rectangle.getWidth() + ", length = " + rectangle.getLength() + ", area = " + rectangle.getArea() + " and perimeter = " + rectangle.getPerimeter());
        System.out.println();
        rectangle.howToColor();
    }
}
