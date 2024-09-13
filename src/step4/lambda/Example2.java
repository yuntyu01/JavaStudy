package step4.lambda;

public class Example2 {
    public static double calc(Function fun){
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result = " + result);
    }
}
