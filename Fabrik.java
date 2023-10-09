import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Die Klasse Fabrik nimmt die Bestellungen der Kunden und Kundinnen entgegen und verwaltet diese ebenfalls.
 * 
 * @author Simon Fürst
 * @version 1, Datum: 03.10.2023
 */
public class Fabrik
{  
    // Instanzvariablen
    /**
     *Liste mit Bestellungen: Liste aller Bestellungen, welche als Typ <Bestellung> gespeichert werden.
     *Bestellungsnummer: Jeder einzelnen Bestellung wird eine Bestellungsnummer zugewiesen.
     */
    
    public Bestellung bestellung;
    public ArrayList<Bestellung> bestellungen = new ArrayList<>();
    public static int bestellungsNr = 0;

    /**
     * Hier wird die Main-Methode aufgerufen.
     * Sie ermöglicht den Einstieg in das Programm bzw. das Aufgeben und Ausgeben von Bestellungen.
     */
    public static void main(String[] args)
    {
        Fabrik fabrik1 = new Fabrik();
        fabrik1.bestellungAufgeben(1,2);
        fabrik1.bestellungAusgeben();
    }
    
    //Konstuktor
    /** Hier wird die Instanzvariabel initialisiert
     */
    
    public Fabrik()
    {
        // Initialisierung
        bestellungen = new ArrayList<Bestellung>();
    }
    
    /**
     * Methode: Ermöglicht es Bestellungen von Stühlen und Sofas aufzugeben.
     * @parameter: Die Anzahl Stühle und Sofas werden als integer angegeben.
     */
    public void bestellungAufgeben(int stuehle, int sofas)
    {
        if (stuehle < 0 || sofas < 0)
        {
        System.out.println("Bitte geben Sie einen positiven Wert ein");
        }
        else{
        this.bestellung = new Bestellung(stuehle, sofas);
        bestellung = this.bestellung;
        bestellungen.add(bestellung);
        bestellung.gibBestellBestaetigung();
        }
    }
    
    /**
     * Methode: Ermöglicht es Bestellungen von Stühlen und Sofas auszugeben.
     * Zudem gibt sie jeweils die Information zu den einzelnen Bestellungen in Form von Strings aus.
     */
    public void bestellungAusgeben()
    {
        for(int i = 1; i < bestellungen.size(); i++)
        {
            Bestellung bestellung = bestellungen.get(i);
            System.out.println("######################################");
            System.out.println("Totale Bestellungen: " + totalBestellungen());
            System.out.println("Bestellung " + bestellung.gibBestellungsNr()+ ": ");
            System.out.println("Anzahl der Stühle = " + bestellung.gibAnzahlStuehle());
            System.out.println("Anzahl der Sofas = " + bestellung.gibAnzahlSofas());
            System.out.println("Beschaffungszeit = " + bestellung.gibBeschaffungsZeit()+ " Tage");
            System.out.println("######################################");
            
        }
    }
    
    /**
     * Methode: Gibt die Grösse der totalen Bestellungen aus.
     * @return: integer / ganze Zahl
     */
    
    public int totalBestellungen()
    {
        int totalBestellungen = bestellungen.size();
        return totalBestellungen;
    }
    
    /**
     * Methode: Ermöglicht es alle Bestellungen der Liste <Bestellungen> auszugeben:
     * @return: Liste
     */
    public ArrayList<Bestellung> gibBestellungen()
    {
        return bestellungen;
    }
}
