package main.java.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdventOfCode3 {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code_3.txt";
    private static String firstString;
    private static String secondString;
    private static int total = 0;

    public static void main(String[] args) throws IOException {



        String streamValue;

        List<Integer> sumList = new ArrayList<>();

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Iterator<String> iterator = br.lines().iterator();

            while (iterator.hasNext()) {
                streamValue = iterator.next();
                firstString = streamValue.substring(0, (streamValue.length() / 2));
                secondString = streamValue.substring(streamValue.length() / 2, streamValue.length());

                locateCommonAlphabet(firstString, secondString);
            }
            System.out.println("Total:"+total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void locateCommonAlphabet(String firstString, String secondString) {

        while (firstString.length() > 0) {
            char c = firstString.charAt(0);

            if (secondString.contains(String.valueOf(c))) {
                System.out.println("This alphabet is found in both strings: " + c);
                if (Character.isLowerCase(c)) {
                    System.out.println((int) c - 96);
                    total+= ((int) c - 96);
                }
                if (Character.isUpperCase(c)) {
                    System.out.println((int) c - 38);
                    total+= ((int) c - 38);
                }
                break;
            }

            // Remove char whose occurrence is checked
            firstString = firstString.replace(Character.toString(c), "");
        }
    }
}