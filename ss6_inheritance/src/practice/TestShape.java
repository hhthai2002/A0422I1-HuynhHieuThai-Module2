package practice;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();
        System.out.print("Enter color of shape: ");
        String color = sc.next();
        s.setColor(color);
        boolean filled = true;
        s.setFilled(filled);
        System.out.println(s);
    }
}
