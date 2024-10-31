package hu.petrik.szuperhosprojekt;
import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public abstract boolean megmentiAVilagot();

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean LegyoziE(Szuperhos szuperhos){
        if(szuperhos instanceof Bosszuallo) return (this.szuperero > szuperhos.mekkoraAzEreje() && ((Bosszuallo) szuperhos).vanEGyengesege);
        if(szuperhos instanceof Batman) return (this.szuperero >= szuperhos.mekkoraAzEreje()*2);
        return false;
    }
    public double mekkoraAzEreje(){
        return this.szuperero;
    }

    @Override
    public String toString() {
        String szoveg = MessageFormat.format("Szupererő: {0, number, #.##} ",this.szuperero);
        if(vanEGyengesege) szoveg += "Van gyengesége";
        else szoveg += "Nincs gyengesége";
        return szoveg;
    }

    public double getSzuperero(){
        return this.szuperero;
    }
    public boolean GetVanEGyengesege(){
        return this.vanEGyengesege;
    }

    public void setSzuperero(final double szuperero) {
        this.szuperero = szuperero;
    }
    public void setVanEGyengesege(final boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

}
