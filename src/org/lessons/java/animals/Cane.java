package org.lessons.java.animals;

public class Cane extends Animale{
    @Override
    public void verso() {
        System.out.println("Woof!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne e verdure");
    }
}
