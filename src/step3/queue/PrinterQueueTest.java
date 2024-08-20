package step3.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        for (String s : printQueue) {
            System.out.println("출력: " + s);
        }
    }
}
