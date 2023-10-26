package org.lessons.java.players;

public class Main {
    public static void main(String[] args) {
        try {
            Player player = Creator.create("dvd");
            player.play();
            player.stop();
        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }
}
