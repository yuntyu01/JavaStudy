package step4.lambda;

public class Example {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("작업스레드가 실행됩니다.");
            System.out.println("작업스레드가 실행됩니다.");
            System.out.println("작업스레드가 실행됩니다.");
        });
        thread.start();
    }
}
