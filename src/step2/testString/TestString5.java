package step2.testString;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println("filename = " + str.substring(0, str.indexOf(ext)));
        System.out.println("extName = " + ext);
    }
}
