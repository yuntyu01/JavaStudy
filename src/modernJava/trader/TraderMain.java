package modernJava.trader;

import modernJava.Dish;

import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TraderMain {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> num1 = transactions.stream()
                .filter(a -> a.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        List<String> num2 = transactions.stream()
                .map(a -> a.getTrader().getCity())
                .distinct()
                .collect(toList());

        List<Trader> num3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(a -> a.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());

        List<String> num4 = transactions.stream()
                .map(a -> a.getTrader().getName())
                .distinct()
                .sorted()
                .collect(toList());

        Boolean num5 = transactions.stream()
                .anyMatch(a -> a.getTrader().getCity().equals("Milan"));


        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        Optional<Integer> min = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        transactions.stream()
                .filter(a -> a.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
