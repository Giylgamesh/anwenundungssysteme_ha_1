public class Kostenberechnung {

    // Methode zum Berechnen der monatlichen Kosten für ein Produkt
    public class Produkt {
        // ... (andere Attribute und Methoden)
    
        public double berechneMonatlicheKosten() {
            // Implementieren Sie hier die Berechnung der monatlichen Kosten
            double kosten = 0.0; // Zwischenspeicher für die Gesamtkosten
    
            // Lagerkosten berechnen (z.B. abhängig vom Lagerbestand und Lagerort)
            if (lagerort.equalsIgnoreCase("kühl")) {
                kosten += lagerbestand * 0.5; // Beispiel: Kühllagerung kostet 50 Cent pro Einheit pro Monat
            } else {
                kosten += lagerbestand * 0.2; // Beispiel: Normale Lagerung kostet 20 Cent pro Einheit pro Monat
            }
    
            // Fixkosten pro Produkt (optional)
            kosten += 2.0; // Beispiel: Fixkosten von 2€ pro Produkt pro Monat
    
            return kosten;
        }
    }

}