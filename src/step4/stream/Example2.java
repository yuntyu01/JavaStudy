package step4.stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book", "Lambda Expressions", "java supports lambda expressions");

        List<String> java = list.stream()
                .filter(s -> s.contains("java"))
                .toList();

        //System.out.println(java);
        java.forEach(s -> System.out.println(s));

    }
}
