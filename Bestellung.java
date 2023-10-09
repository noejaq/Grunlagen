
import java.util.ArrayList;

/**
 * Die Klasse "Bestellung" verwaltet eine ArrayList, in der alle bestellten Produkte (Stühle oder Sofas) gespeichert werden.
 * Globale Variablen sind die "bestellBestätigung", "beschaffungszeit", "bestellNummer", "anzahlStuehle" und "anzahlSofas". 
 * Jede globale Variable verfügt über eine Methode, um die Bestellinformationen abzufragen und/oder abzuändern.
 * 
 * @author Simon Fürst 
 * @version 1, Datum: 03.10.2023
 */
public class Bestellung
{
    // Instanzvariablen
    /**
     * Beschreibung der Instanzvariablen:
     * bestellteProdukte:       Eine Liste mit allen bestellten Produkten bzw. vom Typ <Produkt>
     * bestellBestaetigung:     Gibt an, ob eine Bestellung eingegangen ist
     * beschaffungsZeit:        Gibt die Beschaffungszeit der eingegangenen Bestellung an
     * anzahlStuehle:           Gibt die Anzahl der bestellten Stühle an
     * anzahlSofas:             Gibt die Anzahl der bestellten Sofas an
     * bestellNummer:           Gibt die Bestellnummer der Bestellung an
     */
    
    public ArrayList<Produkt> bestellteProdukte = new ArrayList<Produkt>();
    private boolean bestellBestaetigung = true;
    private int beschaffungsZeit = 2;
    private int anzahlStuehle;
    private int anzahlSofas;
    private int bestellNummer;

    /**
     * Konstruktor
     * Initialisierung der Variable Bestellung
     * @parameter: integer
     */
    public Bestellung(int anzahlStuehle, int anzahlSofas)
    {
        // Instanzvariable initialisieren
        this.beschaffungsZeit = beschaffungsZeit;
        this.anzahlStuehle = anzahlStuehle;
        this.anzahlSofas = anzahlSofas;
        Fabrik.bestellungsNr++;
        bestellNummer = Fabrik.bestellungsNr;
        
        int counter = 0;
        while (counter < gibAnzahlStuehle())
        {
            Produkt stuhl = new Stuhl();
            bestellteProdukte.add(stuhl);
            counter = counter + 1;
        }
        
        counter = 0;
        while (counter < gibAnzahlSofas())
        {
            Produkt sofa = new Sofa();
            bestellteProdukte.add(sofa);
            counter = counter + 1;
        }
    }

    /**
     * Methode: Die Bestellung wird mit einem String bestätigt oder eben nicht.
     */
    public void bestellungBestaetigen()
    {
        if(bestellBestaetigung ==true)
            System.out.println("Besten Dank! Deine Bestellung wurde bestätigt");
        else
            System.out.println("Ups! Deine Bestellung konnte nicht bestätigt werden");
    }
    
    /**
     * Methode: Abrufen der Bestellbestätigung
     * @return: Gibt "True" oder "False" aus
     */
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;
    }
    
    /**
     * Methode: Abrufen der Bestellnummer
     * @return: integer
     */
    public int gibBestellungsNr()
    {
        return bestellNummer;
    }
    
    /**
     * Methode: Abrufen der Beschaffungszeit
     * @return: integer
     */
    public int gibBeschaffungsZeit()
    {
        return beschaffungsZeit;
    }
    
    /**
     * Methode: Setzen der Beschaffungszeit
     * @parameter: integer
     */
    public void setzeBeschaffungszeit(int beschaffungsZeit)
    {
        this.beschaffungsZeit = beschaffungsZeit;
    }
    
    /**
     * Methode: Abrufen der Anzahl Stühle
     * @return: integer
     */
    public int gibAnzahlStuehle()
    {
        return anzahlStuehle;
    }
    
    /**
     * Methode: Abrufen der Anzahl Sofas
     * @return: integer
     */
    public int gibAnzahlSofas()
    {
        return anzahlSofas;
    }
}

