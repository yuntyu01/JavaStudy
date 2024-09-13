import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().map(Test1::divideByZero).forEach(System.out::println);
    }

    public static int divideByZero(int n){
        return n/0;
    }
}
