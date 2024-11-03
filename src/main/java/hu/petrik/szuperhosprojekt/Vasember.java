package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        // Generál egy 0-10 közötti véletlenszerű lebegőpontos számot
        double novekedes = random.nextDouble() * 10;
        // Növeli a szupererőt a véletlenszerű értékkel
        setSzuperero(getSzuperero() + novekedes);
    }
    @Override
    public String toString() {
        return "Vasember - Szupererő: " + getSzuperero() + "; " +
                (isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége");
    }
}
