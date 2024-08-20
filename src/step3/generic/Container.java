package step3.generic;

public class Container <T>{
    private T data;

    public void setItem(T data) {
        this.data = data;
    }

    public T getItem() {
        return data;
    }

    public boolean isEmpty() {
        return data == null;
    }
}
