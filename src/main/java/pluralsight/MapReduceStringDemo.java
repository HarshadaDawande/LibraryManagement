package main.java.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceStringDemo {

    public static void main(String[] args) {
        MapReduceStringDemo demo = new MapReduceStringDemo();
        List<String> words = Arrays.asList("corejava","spring","hibernate");
        String longestString = demo.calculateLongestString(words);
        System.out.println(longestString);
        String str = words.stream().filter(w -> w.length()>5)
                .findAny()
                .orElse("Short string");
        //System.out.println(str);
    }

    public String calculateLongestString(List<String>  words){
        String longestString = words.stream()
                .reduce((word1,word2)-> word1.length() > word2.length() ? word1 : word2)
                .get();
        return longestString;
    }
}
