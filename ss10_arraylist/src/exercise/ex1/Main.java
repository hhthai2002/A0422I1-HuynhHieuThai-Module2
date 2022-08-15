package exercise.ex1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(3);
        myList.add(0, 0);
        myList.add(1, 1);
        myList.add(2, 2);
        myList.Add(7);
        System.out.println("element 1 :" + myList.get(0));
        System.out.println("element 2 :" + myList.get(1));
        System.out.println("element 3 :" + myList.get(2));
        System.out.println("size: " + myList.size());

    }
}
