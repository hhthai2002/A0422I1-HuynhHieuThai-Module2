package exercise;

import java.util.Scanner;

public class AppearanceCharacterCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some characters: ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.print("The length of the string is: " + length);
        System.out.println();

        System.out.print("Enter the character you want to count number of appearance: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < length; i++){
            if(c == str.charAt(i)){
                count +=1;
            }
        }
        System.out.print("The character " + c + " appearances " + count + " time/times");
    }
}
