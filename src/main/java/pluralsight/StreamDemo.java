package main.java.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    final static String file = "D://meeting_saved_chat.txt";
    public static void main(String[] args) throws IOException{
/*
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
             br.lines().forEach(System.out::println);
        }  catch(IOException e){

        }

        try (Stream st = Files.lines(Paths.get(file))) {
            st.forEach(System.out::println);
        }catch(IOException e){

        }

        Pattern patt = Pattern.compile(",");
        patt.splitAsStream("a,b,c").forEach(System.out::println);
        //Stream.iterate(1, i -> 10).forEach(System.out::print);
        IntStream.range(1, 11).forEach(System.out::print);
*/
        // "." takes the root directory of java project - C:\Users\om\IdeaProjects\pluralsight
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
    }

}
