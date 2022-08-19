package exercise.ex2;

public class InsertionSort {
    public static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void show(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%4d", list[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 23, 645, 745, 3, 15};
        sort(list);
        show(list);
    }
}
