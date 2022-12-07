package main.java.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class AdventOfCode4 {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code_4.txt";
    private static String firstString;
    private static String secondString;
    private static int total = 0;

    public static void main(String[] args) throws IOException {


        String sectionIDsList1;
        String sectionIDsList2;
        String sectionIDsList3;

        List<Integer> sumList = new ArrayList<>();

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Iterator<String> iterator = br.lines().iterator();

            while (iterator.hasNext()) {
                sectionIDsList1 = iterator.next();

//                System.out.println(sectionIDsList1);
                //sectionIDsList2 = iterator.next();
                //sectionIDsList3 = iterator.next();

                IntStream range1 = IntStream.range(Character.getNumericValue(sectionIDsList1.charAt(0)),
                        Character.getNumericValue(sectionIDsList1.charAt(2)) + 1);

                IntStream range2 = IntStream.range(Character.getNumericValue(sectionIDsList1.charAt(4)),
                        Character.getNumericValue(sectionIDsList1.charAt(6)) + 1);

                range1.forEach(System.out::println);
                range2.forEach(System.out::println);

                range1.forEach(value -> {
                    range2.forEach(value1 -> {
                        if (value == value1) {

                        }
                });
            });
        }
        System.out.println("Total:" + total);
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }
}
}