package step4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 20));
        totalList.add(new Student("김자바", "남", 10));
        totalList.add(new Student("오해영", "여", 30));

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getSex(),
                                s -> s.getAge()
                        )
                );

        System.out.println(map);
    }

    static class Student {
        private String name;
        private String sex;
        private Integer age;

        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public Student(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
    }
}
