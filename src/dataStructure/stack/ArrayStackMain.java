package dataStructure.stack;

import java.sql.SQLOutput;

public class ArrayStackMain {
    public static void main(String[] args) {
        MyArrayStack<Integer> myArrayStack = new MyArrayStack<>(5);

        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);

        System.out.println("stack.isEmpty() : " + myArrayStack.isEmpty());

        System.out.println("stack.pop() : " + myArrayStack.pop());
        System.out.println("stack.pop() : " + myArrayStack.pop());
        System.out.println("stack.pop() : " + myArrayStack.pop());

        System.out.println("stack.peek() : " + myArrayStack.peek());


        System.out.println("stack.isEmpty() : " + myArrayStack.isEmpty());
    }
}
