package step4.lambda;

public class Example4 {
    private static Student[] students = {
            new Student("홍길동", 90, 36),
            new Student("신용권", 95, 93)
    };

    public static double avg(Function1<Student> function1){
        double sum = 0;
        for (Student student : students) {
            sum += function1.apply(student);
        }

        return sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수 : " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수 : " + mathAvg);
    }
}
