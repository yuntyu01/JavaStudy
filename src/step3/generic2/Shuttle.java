package step3.generic2;

import java.util.ArrayList;
import java.util.List;

public class Shuttle <T>{
    List<T> cart = new ArrayList<>();

    public void in(T bioUnit) {
        cart.add(bioUnit);
    }

    public T out(){
        return cart.getFirst();
    }

    public <X> void boci (X t){

    }

    public void showinfo() {
        System.out.println(cart);
    }
}
