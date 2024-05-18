package org.example;
package org.example.Datenbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatenbankMethoden {

    private static Scanner scanner = new Scanner(System.in);

    // Methode zum Hinzufügen eines Produkts
    public static void produktHinzufügen() {
        System.out.println("\nProdukt hinzufügen");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Beschreibung: ");
        String beschreibung = scanner.nextLine();

        System.out.print("Preis: ");
        double preis = scanner.nextDouble();
        scanner.nextLine(); // Puffer leeren

        System.out.print("Lagerbestand: ");
        double lagerbestand = scanner.nextDouble();
        scanner.nextLine(); // Puffer leeren

        System.out.print("Lagereinheit (STÜCK, KG, L): ");
        String lagereinheit = scanner.nextLine().toUpperCase();

        System.out.print("Lagerort (normal, kühl): ");
        String lagerort = scanner.nextLine().toLowerCase();

        // ... (ggf. weitere Attribute abfragen)

        // Produkt in der Liste "produkte" speichern
        produkte.add(new Produkt(name, beschreibung, preis, lagerbestand, lagereinheit, lagerort));
        System.out.println("Produkt erfolgreich hinzugefügt!");
    }
    // 
    public Produkt findProduktByName(String name) {
        // Durchsuchen Sie die Liste 'produkte' nach dem Produkt mit dem angegebenen Namen
        for (Produkt produkt : produkte) {
            if (produkt.getName().equalsIgnoreCase(name)) {
                return produkt; // Produkt gefunden, zurückgeben
            }
        }

        // Produkt nicht gefunden, null zurückgeben
        return null;
    }

    // Methode zum Bearbeiten eines Produkts
    public static void produktBearbeiten() {
        System.out.println("\nProdukt bearbeiten");
        System.out.print("Name des zu bearbeitenden Produkts: ");
        String name = scanner.nextLine();

        // Produkt in der Liste "produkte" suchen
        Produkt produkt = findProduktByName(name);

        if (produkt != null) {
            // Produktattribute bearbeiten
            System.out.println("Aktuelle Daten:");
            System.out.println("Name: " + produkt.getName());
            System.out.println("Beschreibung: " + produkt.getBeschreibung());
            System.out.println("Preis: " + produkt.getPreis());
            System.out.println("Lagerbestand: " + produkt.getLagerbestand() + " " + produkt.getLagereinheit());
            System.out.println("Lagerort: " + produkt.getLagerort());

            System.out.print("\nNeue Daten eingeben (oder Enter drücken zum Überspringen):");

            System.out.print("Name: ");
            String neuerName = scanner.nextLine().trim().isEmpty() ? produkt.getName() : scanner.nextLine();

            System.out.print("Beschreibung: ");
            String neueBeschreibung = scanner.nextLine().trim().isEmpty() ? produkt.getBeschreibung() : scanner.nextLine();

            // ... (Änderung weiterer Attribute wie Preis, Lagerbestand usw.)

            // Geänderte Daten im Produkt speichern
            produkt.setName(neuerName);
            produkt.setBeschreibung(neueBeschreibung);
            // ... (Änderungen weiterer Attribute setzen)

            System.out.println("Produkt erfolgreich bearbeitet!");
        } else {
            System.out.println("Produkt nicht gefunden.");
        }
    }

    // Methode zum Löschen eines Produkts
    public static void produktLöschen() {
        System.out.println("\nProdukt löschen");
        System.out.print("Name des zu löschenden Produkts: ");
        String name = scanner.nextLine();

        // Produkt in der Liste "produkte" suchen
        Produkt produkt = findProduktByName(name);

        if (produkt != null) {
            produkte.remove(produkt);
            System.out.println("Produkt erfolgreich gelöscht!");
        } else {
            System.out.println("Produkt nicht gefunden.");
        }
    }

    // Methode zum Suchen von Produkten
    public static void produktSuchen() {
        System.out.println("\nNach Produkten suchen");
        System.out.print("Suchbegriff: ");
        String suchbegriff = scanner.nextLine();

        List<Produkt> ergebnisse = new ArrayList<>();

        for (Produkt produkt : produkte) {
            if (produkt.getName().toLowerCase().contains(suchbegriff.toLowerCase()) ||
                    produkt.getBeschreibung().toLowerCase().contains(suchbegriff.toLowerCase())) {
                ergebnisse.add(produkt);
            }
        }

        if (ergebnisse.isEmpty()) {
            System.out.println("Keine Produkte gefunden.");
        } else {
            System.out.println("Produkt Gefunden")
        }
    }
}