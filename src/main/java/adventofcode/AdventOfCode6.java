package main.java.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdventOfCode6 {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code_6.txt";
    private static String firstString;
    private static String secondString;
    private static int total = 0;
    private static String str;

    public static void main(String[] args) throws IOException {


        String streamValue = "";
        int startIndex = 0;
        int DISTINCT_CHARACTER_NUMBER = 14;
        int endIndex = DISTINCT_CHARACTER_NUMBER;
        int charsStrippedOff = 0;
        boolean startOfPacketMarkerFound = false;
        List<Integer> sumList = new ArrayList<>();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Iterator<String> iterator = br.lines().iterator();

            while (iterator.hasNext()) {
                streamValue = iterator.next();
            }
            int i = 0;
            while (!startOfPacketMarkerFound && streamValue.length() > DISTINCT_CHARACTER_NUMBER) {
                str = streamValue.substring(startIndex, endIndex);
                System.out.println(str);
                for (i = startIndex; i < endIndex; i++) {
                    char ch = str.charAt(i);
                    System.out.println("Char to search is " + ch);
                    int lastIndexOf = str.lastIndexOf(ch);
                    if (lastIndexOf != i) {
                        System.out.println(ch + " is repeated in " + str);
                        streamValue = streamValue.substring(startIndex + 1);
                        charsStrippedOff++;
                        break;
                    } else {
                        //startOfPacketMarkerFound = true;
                        //break;
                    }
                }
                if (i == DISTINCT_CHARACTER_NUMBER) {
                    System.out.println("Start of message marker : " + (charsStrippedOff+DISTINCT_CHARACTER_NUMBER));
                    startOfPacketMarkerFound = true;
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}