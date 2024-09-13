package step4.thread;

public class WorkObject {
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "methodA 작업 실행");
        notify();
        try {
            wait();
        }catch (InterruptedException e){
        }
    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "methodB 작업 실행");
        notify();
        try {
            wait();
        }catch (InterruptedException e){
        }
    }


}
