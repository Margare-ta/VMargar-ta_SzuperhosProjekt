package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",\\s*"); // Split és space eltávolítása
                if (parts.length == 2) {
                    String hosTipus = parts[0];
                    int kutyukSzama;
                    try {
                        kutyukSzama = Integer.parseInt(parts[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Hibás formátum: " + line);
                        continue; // Ha a szám formátum hibás, lépjen a következő sorra
                    }

                    Szuperhos hos;
                    if ("Batman".equalsIgnoreCase(hosTipus)) {
                        hos = new Batman();
                    } else if ("Vasember".equalsIgnoreCase(hosTipus)) {
                        hos = new Vasember();
                    } else {
                        System.out.println("Ismeretlen hős típus: " + hosTipus);
                        continue; // Ha nem Batman vagy Vasember, lépjen a következő sorra
                    }

                    for (int i = 0; i < kutyukSzama; i++) {
                        if (hos instanceof Batman) {
                            ((Batman) hos).kutyutKeszit();
                        } else if (hos instanceof Vasember) {
                            ((Vasember) hos).kutyutKeszit();
                        }
                    }

                    szuperhosLista.add(hos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl beolvasása közben: " + e.getMessage());
        }
    }

    public static void szuperhosok() {
        System.out.println("A szuperhősök listája:");
        for (Szuperhos hos : szuperhosLista) {
            System.out.println(hos);
        }

    }
}
