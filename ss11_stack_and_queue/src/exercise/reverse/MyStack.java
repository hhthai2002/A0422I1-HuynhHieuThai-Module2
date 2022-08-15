package exercise.reverse;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public String[] input(){
        return input();
    }
    public void push(T element) {
        stack.add(element);
    }

}
