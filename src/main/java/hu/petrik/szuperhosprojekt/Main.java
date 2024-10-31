package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Kepregeny.szereplok("Data.txt");
        Kepregeny.szuperhosok();
    }
}