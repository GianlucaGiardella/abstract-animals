package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Animale[] animali = new Animale[4];
        animali[0] = new Cane();
        animali[1] = new Passerotto();
        animali[2] = new Aquila();
        animali[3] = new Delfino();

        for (Animale animale : animali) {
            animale.dormi();
            animale.verso();
            animale.mangia();

            if (animale instanceof SaVolare) {
                faiVolare(animale);
            }

            if (animale instanceof SaNuotare) {
                faiNuotare(animale);
            }
            System.out.println();
        }
    }

    public static void faiVolare(Animale animale) {
        ((SaVolare) animale).vola();
    }

    public static void faiNuotare(Animale animale) {
        ((SaNuotare) animale).nuota();
    }
}
