package step4.thread.excutor;

import java.util.concurrent.ExecutionException;

public class OrderServiceTestMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234";
        OrderService orderService = new OrderService();
        orderService.order(orderNo);
    }
}
