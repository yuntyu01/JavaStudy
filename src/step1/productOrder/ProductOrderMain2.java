package step1.productOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder2[] productOrder2 = new ProductOrder2[3];
        productOrder2[0] = createOrder("두부", 2000,2);
        productOrder2[1] = createOrder("김치", 5000,1);
        productOrder2[2] = createOrder("콜라", 1500,2);

        printOrders(productOrder2);
        getTotalAmount(productOrder2);
    }

    public static ProductOrder2 createOrder(String productName, int price, int quantity) {
        ProductOrder2 productOrder2_1 = new ProductOrder2(productName, price, quantity);
        return productOrder2_1;
    }

    static void printOrders(ProductOrder2[] order2){
        for (ProductOrder2 productOrder2 : order2) {
            System.out.println("상품명 : " + productOrder2.productName + ", 가격 : " + productOrder2.price + ", 수량 : " +productOrder2.quantity );
        }

    }
    static void getTotalAmount(ProductOrder2[] order2){
        int total = 0;
        for (ProductOrder2 productOrder2 : order2) {
            total += productOrder2.price * productOrder2.quantity;
        }
        System.out.println("총 결제 금액 : " + total);
    }
}