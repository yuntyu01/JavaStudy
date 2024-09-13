package beakJoon.bronze.bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Scale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[8];

        for (int i = 0; i < 8; i++) {
            num[i] = scanner.nextInt();
        }

        if (IntStream.range(0,8).allMatch( i -> num[i] == i + 1 )){
            System.out.println("ascending");
            IntStream.range(0,8).forEach(System.out::println);
            return;
        }

        if (IntStream.range(0,8).allMatch(i -> num[i] == 8 - i)){
            System.out.println("descending");
            return;
        }

        System.out.println("mixed");
    }
}
