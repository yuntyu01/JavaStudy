package step4.stream;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        double avg = list.stream()
                .mapToInt(s -> s.getAge())
                .average()
                .orElse(0.0);

        System.out.println("평균 나이 : " + avg);
    }
}
