package step4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Member3> list = Arrays.asList(
                new Member3("홍길동", "개발자"),
                new Member3("김나리", "디자이너"),
                new Member3("신용권", "개발자")
        );

        Map<String, List<Member3>> groupingMap = list.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getJob())
                );

        System.out.println("[개발자]");
        List<Member3> groupingDev = groupingMap.get("개발자");
        System.out.println(groupingDev);
        System.out.println();

//        groupingMap.get("개발자").stream()
//                        .forEach(m -> System.out.println(m));

        System.out.println("[디자이너]");
        List<Member3> groupingD = groupingMap.get("디자이너");
        System.out.println(groupingD);


//        groupingMap.get("디자이너").stream()
//                .forEach(m -> System.out.println(m));
    }
}
