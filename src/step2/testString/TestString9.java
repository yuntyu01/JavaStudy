package step2.testString;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] mail = email.split("@");
        String ID = mail[0];
        String domain = mail[1];
        System.out.println("ID = " + ID);
        System.out.println("domain = " + domain);
    }
}
