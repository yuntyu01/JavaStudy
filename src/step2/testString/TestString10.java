package step2.testString;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple, banana, mango";

        String[] fruit = fruits.split(",");
        for (String s : fruit) {
            System.out.println(s);
        }

        fruits = String.join("->", fruit);

        System.out.println(fruits);
    }
}
