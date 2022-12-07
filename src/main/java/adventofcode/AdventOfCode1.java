package main.java.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AdventOfCode1 {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code.txt";

    public static void main(String[] args) throws IOException {

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Stream<String> lines = br.lines();

            // Approach 1
            AdventOfCode1 adventOfCode1 = new AdventOfCode1();
            adventOfCode1.processStreamData(lines);

            // Approach 2
            Consumer<String> action
                    = new MyConsumer();
//            lines.forEach(action);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processStreamData(Stream<String> lines) {
        final int[] total = {0};
        List<Integer> sumList = new ArrayList<>();
        lines.forEach(line -> {
            if (line.equals("")) {
                sumList.add(total[0]);
                total[0] = 0;

            } else
                total[0] += Integer.parseInt(line);
        });
        int maxWithMethodReference = sumList.stream().reduce(Integer::max).get();
        //69281
        System.out.println("The max is :" + maxWithMethodReference);
        System.out.println("sumList Size:" + sumList.size());
    }
}

class MyConsumer implements Consumer<String> {

    int total = 0;
    List<Integer> sumList = new ArrayList<>();

    @Override
    public void accept(String streamValue) {
        if (streamValue.equals("")) {
            sumList.add(total);
            System.out.println("Sum of calories for each Elf:" + total);
            total = 0;
        } else {
            total += Integer.parseInt(streamValue);
        }

        int maxWithMethodReference = -1;
        if (sumList.size() > 1)
            maxWithMethodReference = sumList.stream().reduce(Integer::max).get();
        System.out.println("The max is :" + maxWithMethodReference);
        System.out.println("sumList :" + sumList.size());
    }
}