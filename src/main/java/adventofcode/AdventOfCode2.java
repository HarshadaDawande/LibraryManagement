package main.java.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdventOfCode2 {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code.txt";

    public static void main(String[] args) throws IOException {

        int total = 0;
        String streamValue;
        List<Integer> sumList = new ArrayList<>();

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Iterator<String> iterator = br.lines().iterator();

            while (iterator.hasNext()) {
                streamValue = iterator.next();

                if (streamValue.equals("")) {
                    sumList.add(total);
                    total = 0;
                    continue;
                }

                total += Integer.parseInt(streamValue);
            }
            sumList.add(total);
/*            System.out.println("The sorted list of calories is as below:");
            sumList.stream()
                    .sorted()
                    .distinct()
                    .forEach(System.out::println);*/
            int firstMaxCalories = sumList.stream().reduce(Integer::max).get();
            System.out.println("The first max is :" + firstMaxCalories);
            sumList.remove((Integer) firstMaxCalories);

            int secondMaxCalories = sumList.stream().reduce(Integer::max).get();
            System.out.println("The second max is :" + secondMaxCalories);
            sumList.remove((Integer) secondMaxCalories);

            int thirdMaxCalories = sumList.stream().reduce(Integer::max).get();
            System.out.println("The thirs max is :" + thirdMaxCalories);

            int totalCalories = firstMaxCalories + secondMaxCalories + thirdMaxCalories;
            System.out.println(totalCalories);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
