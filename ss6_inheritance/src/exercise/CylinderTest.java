package exercise;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cl = new Cylinder();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        cl.setRadius(radius);
        System.out.print("Enter color: ");
        String color = sc.next();
        cl.setColor(color);
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        cl.setHeight(height);
        System.out.println(cl);
        System.out.printf("The volume of cylinder is: %.2f", cl.getVolume());
    }
}
