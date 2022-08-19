package exercise.optional;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enQueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow! Can not add element: " + item);
        }
        else{
            tail++;
            if(tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue");
        }
    }

    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Underflow! Can not remove element from Queue");
        }
        else{
            head++;
            if(head == capacity - 1){
                System.out.println("Pop operation done! removed: " + queueArr[head - 1]);
                head = 0;
            }
            else{
                System.out.println("Pop operation done! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enQueue(15);
        queue.enQueue(20);
        queue.enQueue(25);
        queue.enQueue(30);
        queue.enQueue(35);

        queue.deQueue();
        queue.deQueue();
    }
}
