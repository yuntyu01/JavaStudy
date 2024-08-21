package dataStructure.stack;

public class MyArrayStack<T> {
    private int maxSize;
    private T[] arrayStack;
    private int count = -1;

    public MyArrayStack(int maxSize) {
        this.maxSize = maxSize;
        arrayStack = (T[]) new Object[maxSize];
    }

    public void push(T t) {
        if (count >= maxSize) {
            System.out.println("가득 찼습니다");
            return;
        }
        arrayStack[++count] = t;
    }

    public T pop() {
        if (count < 0) {
            System.out.println("비어있습니다");
            return null;
        }
        return arrayStack[count--];
    }

    public T peek() {
        if(count == -1){
            System.out.println("비어있습니다");
            return null;
        }
        return arrayStack[count];
    }

    public boolean isEmpty() {
        return count == -1;
    }
}



