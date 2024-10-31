package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember() {
        super(150,true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return (super.getSzuperero() > 1000);
    }


    @Override
    public void kutyutKeszit() {
        Random rnd = new Random();
        super.setSzuperero(super.getSzuperero() + rnd.nextInt(11));
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return super.legyoziE(szuperhos);
    }
}
