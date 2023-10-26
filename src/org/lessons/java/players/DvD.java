package org.lessons.java.players;

public class DvD implements Player {
    @Override
    public void play() {
        System.out.println("Sono un lettore DvD e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettore DvD e sono in modalità stop");
    }
}
