package step3.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
            while (true) {
            Integer num = scanner.nextInt();
            scanner.nextLine();
            if (num == 0){
                break;
            }
            list.add(num);
        }
        System.out.println("출력\n" + list);
    }
}
