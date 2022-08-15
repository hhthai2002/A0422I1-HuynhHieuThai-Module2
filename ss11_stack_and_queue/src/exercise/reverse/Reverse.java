package exercise.reverse;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 11).toArray();
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println("Array before reverse: ");
        Arrays.asList(array).forEach(System.out::println);
        Stack<Integer> wStack = new Stack<>();
        Arrays.asList(array).forEach(e -> wStack.push(e));
        int sizeW = wStack.size();
        for(int i = 0; i < sizeW; i++){
            array[i] = wStack.pop();
        }
        System.out.println("Array after reversed: ");
        Arrays.asList(array).forEach(System.out::println);
        System.out.println();
        Stack<String> mStack = new Stack<>();
        String name = "Thai dep trai co 102";
        System.out.println("String before reverse: " + name);
        Arrays.asList(name.split(" ")).forEach(e -> mStack.push(e));
        StringBuilder builder = new StringBuilder();
        int sizeM = mStack.size();
        for(int i = 0; i < sizeM; i ++){
            builder.append(mStack.pop());
        }
        System.out.println("String after reversed: " + builder);
    }
}
