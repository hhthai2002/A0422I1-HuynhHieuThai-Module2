package exercise;

import java.util.Scanner;

public class ShowPrimeNum {
    public static void main(String[] args) {
        int number;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of number: ");
        number = Integer.parseInt(scanner.nextLine());

        int N = 2;
        while (count < number) {
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.print(N + "\t");
                count++;
            }
            N++;
        }
    }
}
