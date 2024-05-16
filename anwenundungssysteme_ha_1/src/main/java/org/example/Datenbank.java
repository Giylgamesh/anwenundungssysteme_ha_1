package org.example;
import java.util.Scanner; //ermoeglicht user Eingaben
import java.util.ArrayList; //Methoden fuer Listen
import java.util.List;

public class Datenbank {
    private static List<Produkt> produkte = new ArrayList<>(); /*erstelle Liste mit Datentzp
    "Produkt"-Klasse. Elemente in der Liste heisen hier "produkte" */
    private static Scanner scanner = new Scanner(System.in); /*Scanner nimmt Eingaben ueber die
     Konsole auf und gibt sie weiter an die "wahl" Variable um mit dem Programm zu interagiernen */


    public static void main(String[] args) {
        while (true) {      //solange loop True ist, laeuft das Programm und aktualisiert sich selbst
            //der Nutzer kann hier mit der Datenbank interagieren in dem ein Integer eingegeben wird.
            // ist angenehmer als die Befehle einzutippen

            System.out.println("\nWillkommen zur Uebersicht. Gib eine Zahl ein um eine Option auszuwaehlen.");
            System.out.println("1. Alle Produkte anzeigen");
            System.out.println("2. Produkt suchen");
            System.out.println("3. Produkte sortieren nach...");
            System.out.println("4. Produkt hinzufügen");
            System.out.println("5. Produkt bearbeiten");
            System.out.println("6. Produkt löschen");
            System.out.println("7. Monatliche Kosten anzeigen");
            System.out.println("8. Beenden");

            int wahl = scanner.nextInt();
            scanner.nextLine(); // Puffer leeren

            switch (wahl) {
                case 1:
                    produktHinzufügen();
                    break;
                case 2:
                    produktBearbeiten();
                    break;
                case 3:
                    produktLöschen();
                    break;
                case 4:
                    produktSuchen();
                    break;
                case 5:
                    produkteSortieren();
                    break;
                case 6:
                    alleProdukteAnzeigen();
                    break;
                case 7:
                    monatlicheKostenAnzeigen();
                    break;
                case 8:
                    System.out.println("Programm beendet.");
                    return;
                default:
                System.out.println("FEHLER. Bitte Zahl eingeben!");
            }
        }
    }

}


