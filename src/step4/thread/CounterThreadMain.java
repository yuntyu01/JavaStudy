package step4.thread;

import static java.lang.Thread.sleep;
import static step4.utill.MyLogger.log;

public class CounterThreadMain{

    public static void main(String[] args) {
        Thread threadA = new Thread(new CounterThread("A", 1000), "threadA");
        Thread threadB = new Thread(new CounterThread("B", 500), "threadB");
        threadA.start();
        threadB.start();
    }

    static class CounterThread implements Runnable{
        private String content;
        private int sleepMs;

        public CounterThread(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;

        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log(content);
                try {
                    sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

