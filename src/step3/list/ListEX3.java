package step3.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            Integer num = scanner.nextInt();
            scanner.nextLine();
            if (num == 0) {
                break;
            }
            list.add(num);
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);
    }

}
