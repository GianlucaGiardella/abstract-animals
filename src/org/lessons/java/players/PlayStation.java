package org.lessons.java.players;

public class PlayStation implements Player {

    @Override
    public void play() {
        System.out.println("Sono una PlayStation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una PlayStation e sono in modalità stop");
    }
}
