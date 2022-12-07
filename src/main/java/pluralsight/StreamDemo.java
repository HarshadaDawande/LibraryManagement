package main.java.pluralsight;

import com.sun.glass.ui.Clipboard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

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
                System.out.println(streamValue);
                if (streamValue.equals("")) {

                    sumList.add(total);
                    System.out.println("Making total zero:" + total);
                    total = 0;
                    continue;
                }
                total += Integer.valueOf(streamValue);

            }
            sumList.add(total);
            sumList.stream()
                    .sorted()
                    .distinct()
                    .forEach(System.out::println);
            int maxWithMethodReference = sumList.stream().reduce(Integer::max).get();
            System.out.println("The max is :" + maxWithMethodReference);

        } catch (IOException e) {
            e.printStackTrace();
        }
/*
        Path path = Paths.get(".");
        System.out.println("This is Path:" + path.toString());
        try (Stream st = Files.lines(Paths.get(file))) {
            Iterator iterator = st.iterator();
            int value1 = 0;
            int value2 = 0;
            while (iterator.hasNext()) {

                Object nextValue = iterator.next();
                if (!nextValue.equals(""))
                    value1 = ((Integer) nextValue).intValue();
            }
//            st.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

//        Pattern patt = Pattern.compile(",");
//        patt.splitAsStream("a,b,c").forEach(System.out::println);
//        //Stream.iterate(1, i -> 10).forEach(System.out::print);
//        IntStream.range(1, 11).forEach(System.out::print);

        // "." takes the root directory of java project - C:\Users\om\IdeaProjects\pluralsight
/*
        Path path = Paths.get(".");
        System.out.println(path.toString());

        Files.list(Paths.get("."))
             .map(Path::getFileName) // still a path
             .map(Path::toString) // convert to Strings
             .filter(name -> name.endsWith(".java"))
             .sorted() // sort them alphabetically
             //.limit(5) // first 5
             .forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(12,3,2,6,45,14,9,40);
        numbers.stream()
                .filter(number -> (number % 2 ==0))
                .map(number -> "Square of "+number +" is "+ number * number)
                .forEach(System.out::println);
*/
    }
}
