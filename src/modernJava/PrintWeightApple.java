package modernJava;

public class PrintWeightApple implements PrintApple {


    @Override
    public String accept(Apple a) {
        String print = a.getWeight() > 150 ? "heavy" : "light";
        return "A" + print + ", " + a.getColor() + " apple";
    }
}
