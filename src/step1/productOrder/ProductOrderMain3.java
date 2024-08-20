package step1.productOrder;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder3[] productOrder3 = new ProductOrder3[count];
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrder3[i] = createOrder(productName, price,quantity);
        }

        printOrders(productOrder3);
        getTotalAmount(productOrder3);
    }

    public static ProductOrder3 createOrder(String productName, int price, int quantity) {
        ProductOrder3 productOrder3_1 = new ProductOrder3(productName, price, quantity);
        return productOrder3_1;
    }

    static void printOrders(ProductOrder3[] order3){
        for (ProductOrder3 productOrder3 : order3) {
            System.out.println("상품명 : " + productOrder3.productName + ", 가격 : " + productOrder3.price + ", 수량 : " +productOrder3.quantity );
        }

    }
    static void getTotalAmount(ProductOrder3[] order3){
        int total = 0;
        for (ProductOrder3 productOrder3 : order3) {
            total += productOrder3.price * productOrder3.quantity;
        }
        System.out.println("총 결제 금액 : " + total);
    }
}
