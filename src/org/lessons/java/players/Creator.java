package org.lessons.java.players;

public class Creator {
    private Creator() {
    }

    public static Player create(String input) throws IllegalArgumentException {
        return switch (input.trim().toLowerCase()) {
            case "playstation" -> new PlayStation();
            case "dvd" -> new DvD();
            default -> throw new IllegalArgumentException("Invalid input");
        };
    }
}
