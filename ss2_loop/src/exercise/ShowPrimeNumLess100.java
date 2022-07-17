package exercise;

public class ShowPrimeNumLess100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        System.out.println("Prime numbers that less than 100: ");
        while (N < 100) {
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