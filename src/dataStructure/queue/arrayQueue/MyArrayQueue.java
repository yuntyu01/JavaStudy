package dataStructure.queue.arrayQueue;

import java.util.Arrays;

public class MyArrayQueue<E> {
    private E[] myArrayQueue;
    private int size = 16;
    private int count = 0;

    public MyArrayQueue() {
        myArrayQueue = (E[]) new Object[size];
    }

    public MyArrayQueue(int size){
        myArrayQueue = (E[]) new Object[size];
    }

    public void enqueue(E e){
        if (count >= size){
            size = (int)(size * 1.75);
            myArrayQueue = Arrays.copyOf(myArrayQueue, size );
        }
        myArrayQueue[count] = e;
        count++;
    }

    public E dequeue(){
        E first = myArrayQueue[0];
        for (int i = 0; i < count; i++) {
            myArrayQueue[i] = myArrayQueue[i+1];
        }
        count --;
        return first;
    }

    public E peek(){
        if (count == 0){
            System.out.println("queue가 비어있습니다.");
            return null;
        }
        return myArrayQueue[0];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
        return "MyArrayQueue{" +
                "myArrayQueue=" + Arrays.toString(myArrayQueue) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }
}
