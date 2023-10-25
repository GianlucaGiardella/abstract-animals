package org.lessons.java.animals;

public class Passerotto extends Animale implements SaVolare{

    @Override
    public void verso() {
        System.out.println("Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Cereali, frutta");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
