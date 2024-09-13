package modernJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String[] args) {
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(3, 4);
//
//        List<int[]> list3 = list1.stream()
//                .flatMap(i -> list2.stream()
//                        .filter(j -> (i + j) % 3 == 0)
//                        .map(j -> new int[]{i, j})
//                )
//                .collect(toList());
//
//        list3.stream()
//                .forEach(arr -> System.out.println(Arrays.toString(arr)));
//
//
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("fries", true, 500, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", false, 600, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));


        int count = menu.stream()
                        .map(a -> 1)
                                .reduce(0, (a, b) -> a+b);
        System.out.println(count);
    }
}


