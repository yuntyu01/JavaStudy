//24.09.03
package beakJoon.bronze.bronze2;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int[] array;
        while (true){
            count = scanner.nextInt();
            if(count <= 45) break;
            System.out.println("다시 입력하시오");
        }

        array = new int[count + 2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 0; i < count; i++) {
            array[i + 2] = array[i] + array[i + 1];


        }
        System.out.println(array[count]);

    }

}
