package exercise;

import java.util.Scanner;

public class read_numbers {
    public static void main(String[] args) {
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        System.out.println("Enter the number that you want to read: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 10 && num >= 0){
            switch (num){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        else if(num >= 10 && num < 20){

        }
    }
}
