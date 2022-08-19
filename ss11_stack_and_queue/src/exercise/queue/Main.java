package exercise.queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        solution.enQueue(queue, 10);
        solution.enQueue(queue, 20);
        solution.enQueue(queue, 30);
        solution.displayQueue(queue);
        solution.deQueue(queue);
        System.out.println();
        solution.displayQueue(queue);
    }
}
