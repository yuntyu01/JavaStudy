package dataStructure.queue.arrayQueue;

public class MyArrayQueueMain {
    public static void main(String[] args) {
        MyArrayQueue<Integer> myArrayQueue = new MyArrayQueue<>();

        System.out.println("myArrayQueue.isEmpty() = " + myArrayQueue.isEmpty());
        myArrayQueue.enqueue(1);
        myArrayQueue.enqueue(2);
        myArrayQueue.enqueue(3);

        System.out.println(myArrayQueue);

        System.out.println("myArrayQueue.isEmpty() = " + myArrayQueue.isEmpty());

        System.out.println("myArrayQueue.peek() = " + myArrayQueue.peek());

        System.out.println("myArrayQueue.dequeue() = " + myArrayQueue.dequeue());
        System.out.println("myArrayQueue.dequeue() = " + myArrayQueue.dequeue());
        System.out.println("myArrayQueue.dequeue() = " + myArrayQueue.dequeue());
        System.out.println(myArrayQueue);
    }
}
