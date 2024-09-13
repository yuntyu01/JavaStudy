package step4.thread.boundedeQueue;

public interface BoundedQueue {
    void put(String data);
    String take();
}
