package exercise;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printRec();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    exitProgram();
                    System.exit(0);
                    break;
                default:
                    System.out.print("Not in menu !!!\n");
            }
        }
        while(true);
    }
    public static void printRec(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Rectangle: ");
        int height = sc.nextInt();
        System.out.print("Enter the width of Rectangle: ");
        int width = sc.nextInt();

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the square Triangle: ");
        int height = sc.nextInt();

        for(int i = 0; i <= height; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the square Triangle: ");
        int height = sc.nextInt();

        for(int i = height; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exitProgram(){
        System.out.print("Thanks for your using !");
    }
}
