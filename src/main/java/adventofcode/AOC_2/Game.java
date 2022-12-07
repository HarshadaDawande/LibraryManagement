package main.java.adventofcode.AOC_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Game {

    final static String file = "/Users/harshadadawande/JavaDev/pluralsight/src/main/resources/advent_of_code_2.txt";
    private static String streamValue;
    private int player1Score = 0;
    private int player2Score = 0;

    public static void main(String[] args) {

        Game game = new Game();

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            Iterator<String> iterator = br.lines().iterator();

            while (iterator.hasNext()) {
                streamValue = iterator.next().replace(" ", "");
                System.out.println(streamValue);
                Player player1 = new Player(streamValue.charAt(0));
                Player player2 = new Player(streamValue.charAt(1));
                game.play(streamValue, player1, player2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void play(String streamValue, Player player1, Player player2) {
        WinningRuleBook winningRuleBook = new WinningRuleBook();
        ScoreBook scoreBook = new ScoreBook();

        String winner = winningRuleBook.getWinner(streamValue);
        System.out.println("Winner is : " + winner);

        if (winner == null) {
            player1.setWinningStatus("D");
            player2.setWinningStatus("D");
        }
        if (winner != null) {
            if (winner.charAt(0) == player1.shape()) {
                player1.setWinningStatus("W");
                player2.setWinningStatus("L");
            } else if (winner.charAt(0) == player2.shape()) {
                player1.setWinningStatus("L");
                player2.setWinningStatus("W");
            }
        }
        player1Score += scoreBook.score(String.valueOf(player1.shape()));
        player2Score += scoreBook.score(String.valueOf(player2.shape()));

        player1Score += scoreBook.score(player1.winningStatus());
        player2Score += scoreBook.score(player2.winningStatus());


        System.out.println(player1Score);
        System.out.println(player2Score);
    }
}
