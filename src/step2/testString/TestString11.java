package step2.testString;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String a = new StringBuilder(str).reverse().toString();
        System.out.println(a);

    }
}
