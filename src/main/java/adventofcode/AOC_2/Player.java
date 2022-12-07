package main.java.adventofcode.AOC_2;

public class Player {
    private String winFlag = "D";


    public void setWinningStatus(String winFlag) {
        this.winFlag = winFlag;
    }

    public char shape() {
        return shape;
    }

    private char shape;


    public Player(char shape) {
        this.shape = shape;
    }

    public String winningStatus() {
        return this.winFlag;
    }

    public int score() {
        return -1;
    }
}
