//24.09.12 - 10867번
package beakJoon.silver.silver5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SortNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set =new HashSet<>();
        int count = scanner.nextInt();


        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            set.add(a);
        }

        set.stream()
                .sorted()
                .forEach(a -> System.out.print(a + " "));
    }
}


//Scanner scanner = new Scanner(System.in);
//int count = scanner.nextInt();
//
//
//        Arrays.stream(new int[count])
//                .map(i -> scanner.nextInt()) // 숫자 입력
//        .distinct() // 중복 제거
//                .sorted() // 정렬
//                .forEach(a -> System.out.print(a + " "));
