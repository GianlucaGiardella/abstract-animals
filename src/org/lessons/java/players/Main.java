package org.lessons.java.players;

public class Main {
    public static void main(String[] args) {
        Creator.create("playstation").play();
        Creator.create("playstation").stop();

        System.out.println();

        Creator.create("dvd").play();
        Creator.create("dvd").stop();
    }
}
