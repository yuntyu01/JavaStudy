package step1.car;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private String carName;
    private static int count;

    public Car(String carName) {
        this.carName = carName;
        count++;
        System.out.println("차량 구입, 이름 : " + carName);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + count);
    }
}
