package main.java.adventofcode.AOC_2;

import java.util.HashMap;

/*
 * A, X- Stone
 * B, Y - Paper
 * C, Z - Scissor
 * */
public class WinningRuleBook {

    HashMap<String, String> rules = new HashMap();
    String rule;

    public WinningRuleBook() {

        rules.put("AY", "Y");
        rules.put("AZ", "A");
        rules.put("BX", "B");
        rules.put("BZ", "Z");
        rules.put("CX", "X");
        rules.put("CY", "Z");
    }

    public String getWinner(String rule) {
        return rules.get(rule);
    }
}
