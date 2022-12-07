package main.java.adventofcode.AOC_2;

import java.util.HashMap;

public class ScoreBook {
    private HashMap<String, Integer> scores = null;

    public ScoreBook() {
        scores = new HashMap<String, Integer>();
        scores.put("A", new Integer(1));
        scores.put("X", new Integer(1));
        scores.put("B", new Integer(2));
        scores.put("Y", new Integer(2));
        scores.put("C", new Integer(3));
        scores.put("Z", new Integer(3));


        scores.put("L", new Integer(0));
        scores.put("D", new Integer(3));
        scores.put("W", new Integer(6));
    }

    public int score(String key) {
        return scores.get(key);
    }
}
