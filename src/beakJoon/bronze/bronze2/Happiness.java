//24.09.06 - 15969번
package beakJoon.bronze.bronze2;

import java.util.*;

public class Happiness {

    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            if (a > 1000 || a < 0){
                System.out.println("a는 0이상 1000이하 숫자입니다");
                break;
            }

            students.add(a);
        }

        Optional<Integer> max = students.stream()
                .reduce(Integer::max);

        Optional<Integer> min = students.stream()
                .reduce(Integer::min);


        System.out.println(max.orElse(0) - min.orElse(0));

    }
}
