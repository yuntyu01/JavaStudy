package step4.thread.excutor;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;
import static step4.utill.MyLogger.log;

public class OrderService {

    public void order(String orderNo) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(4);

        Future<Boolean> inv = es.submit(new InventoryWork(orderNo));
        Future<Boolean> shi = es.submit(new ShippingWork(orderNo));
        Future<Boolean> acc = es.submit(new AccountingWork(orderNo));

        Boolean inventoryResult = inv.get();
        Boolean shippingResult = shi.get();
        Boolean accountingResult = acc.get();

        if (inventoryResult && shippingResult && accountingResult){
            log("모든 주문 처리가 성공적으로 완료되었습니다. ");
        }else{
            log("일부 작업이 실패했습니다.");
        }

        es.close();
    }

    static class InventoryWork implements Callable<Boolean>{
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() throws Exception{
            log("재고 업데이트: " + orderNo);
            sleep(1000);

            return true;
        }
    }

    static class ShippingWork implements Callable<Boolean>{
        private final String orderNo;
        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }
        @Override
        public Boolean call() throws Exception {
            log("배송 시스템 알림: " + orderNo);
                sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean> {
        private final String orderNo;
        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }

        }
}
