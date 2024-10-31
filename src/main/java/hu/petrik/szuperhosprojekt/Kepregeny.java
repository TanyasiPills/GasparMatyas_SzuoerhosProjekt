package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();
    public static void szereplok(String path) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(" ");
            if("Vasember".equals(split[0])) {
                Vasember vas = new Vasember();
                int number = Integer.parseInt(split[1]);
                for (int i = 0; i < number; i++) {
                    vas.kutyutKeszit();
                }
                szuperhosLista.add(vas);
            }
            if("Batman".equals(split[0])) {
                Batman batman = new Batman();
                int number = Integer.parseInt(split[1]);
                for (int i = 0; i < number; i++) {
                    batman.kutyutKeszit();
                }
                szuperhosLista.add(batman);
            }
        }

        reader.close();
    }
    public static void szuperhosok(){
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos.toString());
        }
    }
}
