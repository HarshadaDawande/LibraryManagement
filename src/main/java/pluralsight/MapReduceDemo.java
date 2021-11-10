package main.java.pluralsight;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class MapReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,6,7,7,8,9);
        int sum = numbers.stream().mapToInt(i->i).sum();
        //System.out.println(sum);

        // SORTED AND DISTINCT
        numbers.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(sum1);

        Optional<Integer> sumWithMethodReference = numbers.stream().reduce(Integer::sum);
        //System.out.println(sumWithMethodReference);

        Integer multiplicationOfAll = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplicationOfAll);

        int maxNumber = numbers.stream().reduce(0,(a,b)->(a>b?a:b));
        System.out.println(maxNumber);
        // Method reference
        int maxWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxWithMethodReference);

        //var sum BigDecimal = numbers.stream().reduce(BigDecimal.add).get();

    }
}
