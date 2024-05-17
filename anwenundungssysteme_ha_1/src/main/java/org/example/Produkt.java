package org.example;

public class Produkt {

    private String name;
    private String beschreibung;
    private double preis;
    private double lagerbestand;
    private String lagereinheit; // z.B. "STÜCK", "KG", "L"
    private String lagerort; // z.B. "normal", "kühl"

    // Konstruktor
    public Produkt(String name, String beschreibung, double preis, double lagerbestand, String lagereinheit, String lagerort) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.lagerbestand = lagerbestand;
        this.lagereinheit = lagereinheit;
        this.lagerort = lagerort;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getLagerbestand() {
        return lagerbestand;
    }

    public void setLagerbestand(double lagerbestand) {
        this.lagerbestand = lagerbestand;
    }

    public String getLagereinheit() {
        return lagereinheit;
    }

    public void setLagereinheit(String lagereinheit) {
        this.lagereinheit = lagereinheit;
    }

    public String getLagerort() {
        return lagerort;
    }

    public void setLagerort(String lagerort) {
        this.lagerort = lagerort;
    }

    // Weitere Methoden (optional)
    public double berechneMonatlicheKosten() {
        // Implementieren Sie die Berechnung der monatlichen Kosten hier
        // (z.B. Lagerkosten, Fixkosten, ...)
        return 0.0; // Platzhalter
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", preis=" + preis +
                ", lagerbestand=" + lagerbestand +
                ", lagereinheit='" + lagereinheit + '\'' +
                ", lagerort='" + lagerort + '\'' +
                '}';
    }
}