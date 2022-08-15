package exercise.reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anything: ");
        String input = scanner.next();
        String[] words = input.split("\\s+");
        for(String ss : words) {
            stack.push(ss);
            System.out.println(ss);
        }
    }
}
