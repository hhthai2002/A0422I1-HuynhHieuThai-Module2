package exercise;

import java.util.Scanner;

public class Point3DTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3D p3 = new Point3D();
        System.out.print("Enter x: ");
        float x = sc.nextFloat();
        p3.setX(x);
        System.out.print("Enter y: ");
        float y = sc.nextFloat();
        p3.setY(y);
        System.out.print("Enter z: ");
        float z = sc.nextFloat();
        p3.setZ(z);
        System.out.println("Point3D: " + p3);
    }
}
