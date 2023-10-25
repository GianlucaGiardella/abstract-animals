package org.lessons.java.players;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();

        Player player1 = creator.create("playstation");
        player1.play();
        player1.stop();

        System.out.println();

        Player player2 = creator.create("dvd");
        player2.play();
        player2.stop();
    }
}
