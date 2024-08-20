package step2.wrapperTest;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double a = 0;
        for (String s : array) {
            a += Double.parseDouble(s);
        }

        System.out.println(a);

    }
}