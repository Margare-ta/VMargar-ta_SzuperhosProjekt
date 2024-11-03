package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }


    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public int mekkoraAzEreje() {
        return (int) szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos masikHos) {
        if (masikHos instanceof Bosszuallo) {
            Bosszuallo masikBosszuallo = (Bosszuallo) masikHos;
             return masikBosszuallo.isVanEGyengese() && this.szuperero > masikBosszuallo.getSzuperero();
        }
        if (masikHos instanceof Batman) {
            return this.szuperero >= 2 * masikHos.mekkoraAzEreje();
        }
         return false;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public String toString() {
        return String.format( "Szupererő: " + szuperero + "; " +
                (vanEGyengesege ? "van gyengesége" : "nincs gyengesége"));
    }
}
