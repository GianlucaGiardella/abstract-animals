package org.lessons.java.animals;

public class Delfino extends Animale implements SaNuotare{
    @Override
    public void verso() {
        System.out.println("Tke!");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
