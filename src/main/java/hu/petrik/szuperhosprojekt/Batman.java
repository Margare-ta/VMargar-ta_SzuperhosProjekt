package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

   public Batman() {
        this.lelemenyesseg = 100;
    }

    public double getLelemenyesseg() {
        return lelemenyesseg;
    }

    public void setLelemenyesseg(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }

    @Override
    public int mekkoraAzEreje() {
        return (int) (lelemenyesseg * 2);
    }

   @Override
    public boolean legyoziE(Szuperhos masikHos) {
        return masikHos.mekkoraAzEreje() < this.lelemenyesseg;
    }

     public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return String.format("Batman: leleményesség: %.0f", lelemenyesseg);
    }
}
