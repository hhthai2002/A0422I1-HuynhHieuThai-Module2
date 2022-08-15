package exercise.ex2;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.addFirst(6);
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        System.out.println(linkedList.contains(5));
        linkedList.printList();
    }
}
