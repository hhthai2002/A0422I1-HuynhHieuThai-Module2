package exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter the student's name: ");
        String name = sc.nextLine();
        s.setName(name);
        System.out.print("Enter the class's name: ");
        String classes = sc.nextLine();
        s.setClasses(classes);
        System.out.println();
        System.out.print("The student's name is: " + name);
        System.out.println();
        System.out.print("The class's name is: " + classes);
    }
}
