package org.example;
import java.util.Random;
import java.util.Scanner;

public class StenSaksPapirGame {
    private Scanner scanner;
    private Random random;

    public StenSaksPapirGame() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void startGame() {
        System.out.println("Velkommen til Sten, Saks, Papir!");
        System.out.println("Indtast dit navn: ");
        String playerName = scanner.nextLine();

        boolean playAgain = true;
        while (playAgain) {
            System.out.println(playerName + ", vælg sten, saks eller papir: ");
            String playerMove = scanner.nextLine().toLowerCase();

            String computerMove = getRandomMove();
            System.out.println("Computeren valgte: " + computerMove);

            String winner = getWinner(playerMove, computerMove);
            System.out.println("Vinderen er: " + winner);

            System.out.println("Vil du spille igen? (ja/nej)");
            String playAgainResponse = scanner.nextLine().toLowerCase();
            playAgain = playAgainResponse.equals("ja");
        }
    }

    private String getRandomMove() {
        int move = random.nextInt(3);
        if (move == 0) {
            return "sten";
        } else if (move == 1) {
            return "saks";
        } else {
            return "papir";
        }
    }

    private String getWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Uafgjort!";
        } else if ((playerMove.equals("sten") && computerMove.equals("saks")) ||
                (playerMove.equals("saks") && computerMove.equals("papir")) ||
                (playerMove.equals("papir") && computerMove.equals("sten"))) {
            return "Spilleren";
        } else {
            return "Computeren";
        }
    }
}