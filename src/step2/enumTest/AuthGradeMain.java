package step2.enumTest;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade : " + value.getDescription() + "level : " + value.getLevel());
        }
    }

}
