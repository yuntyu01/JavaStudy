package step1.shoppingCart;

public class ShoppingCart {
    private  Item[] cart = new Item[10];
    private  int count;

    public void addItem(Item item){
        if (cart.length <= count) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        cart[count] = item;
        count++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (int i = 0; i < count; i++) {
            int a = cart[i].getPrice() * cart[i].getQuantity();
            System.out.println("상품명 : " + cart[i].getProductName() + ", 합계 : " + a);
            total += a;
        }
        System.out.println("전체 가격 합 : " + total);
    }
}
