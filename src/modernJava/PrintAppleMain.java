package modernJava;

import java.util.List;

public class PrintAppleMain {
    public static void main(String[] args) {
    }

    public static void prettyPrintApple(List<Apple> inventory, PrintApple apple){

        for (Apple apple1 : inventory){
            System.out.println(apple1);
        }
    }
}
