package step3.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> cart = new ArrayList<>();
    public void addItem(Item item1) {
        cart.add(item1);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;

        for (Item item : cart) {
            int sum = item.getPrice() * item.getQuantity();
            System.out.println("상품명 : " + item.getName() + "합계 : " + sum);
            total += sum;
        }
        System.out.println("총 합 :" + total);
    }
}
