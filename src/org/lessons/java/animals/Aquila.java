package org.lessons.java.animals;

public class Aquila extends Animale implements SaVolare{

    @Override
    public void verso() {
        System.out.println("Chiw!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
