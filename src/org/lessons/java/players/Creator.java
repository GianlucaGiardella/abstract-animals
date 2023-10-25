package org.lessons.java.players;

public class Creator {
    public Player create(String input) {
        if (input.trim().equalsIgnoreCase("playstation")) {
            return new PlayStation();
        } else if (input.trim().equalsIgnoreCase("dvd")) {
            return new DvD();
        }

        /*
        switch (input.trim().toLowerCase()) {
            case "playstation":
                return new PlayStation();
            case "dvd":
                return new DvD();
        }*/

        return null;
    }
}
