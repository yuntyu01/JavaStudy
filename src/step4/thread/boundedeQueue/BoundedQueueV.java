package step4.thread.boundedeQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static step4.utill.MyLogger.log;

public class BoundedQueueV implements BoundedQueue {
    private final Queue<String> queue = new ArrayDeque<>();
    private int max;
    private final Lock lock = new ReentrantLock();
    private final Condition productCondition = lock.newCondition();
    private final Condition consumerCondition = lock.newCondition();

    public BoundedQueueV(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        try {
            lock.lock();
            while (queue.size() == max) {
                try {
                    log("[put] 큐가 가득 참, 버림: " + data);
                    productCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            queue.offer(data);
            log("[put] 생산자 데이터 저장, signal() 호출");
            consumerCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String take() {
        try {
            lock.lock();
            while (queue.isEmpty()){
                try {
                    log("[take] 큐가 비어있음");
                    consumerCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            log("[take] 소비자 데이터 획득, signal() 호출");
            productCondition.signal();
            return data;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
