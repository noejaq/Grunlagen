

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

/**
 * Die Test-Klasse FabrikTest führt alle Unit-Tests durch und verwaltet diese. 
 *
 * @author  Simon Fürst 
 * @version 1, Datum: 05.10.2023
 */
public class FabrikTest
{
    /**
     * Konstruktor fuer die Test-Klasse FabrikTest
     * Gibt die Teststruktur für den Test und wird vor jeder Testfall-Methode aufgerufen.
     */
    public FabrikTest()
    {
    }

    /**
     *  Hier wird getestet ob die bestellten Produkte ausgegeben werden können
     */
    @Test
    public void testbestellungAusgeben()
    {
        Fabrik fabrik1 = new Fabrik();
        fabrik1.bestellungAufgeben(3,2);
        fabrik1.bestellungAusgeben();
    }

    /**
     * Hier wird die Anzahl der bestellten Produkte getestet
     */
    @Test
    public void testAnzahlBestellungen()
    {
        Fabrik testFabrik = new Fabrik();
        int anzahlBestellungen = testFabrik.bestellungen.size();
        
        testFabrik.bestellungAufgeben(3,7);
        testFabrik.bestellungAufgeben(4,2);
        
        int anzahlBestellungenNeu = testFabrik.bestellungen.size();
        assertEquals(anzahlBestellungenNeu, anzahlBestellungen+2);
        
    }
    
    /**
     * Hier wird getestet ob eine ungültige Bestellung aufgegeben werden kann
     */
    @Test
    public void testUngueltigeBestellung()
    {
        Fabrik testFabrik = new Fabrik();
        int anzahlBestellungen = testFabrik.bestellungen.size();
        testFabrik.bestellungAufgeben(-10,3);
        int anzahlBestellungenNeu = testFabrik.bestellungen.size();
        assertEquals(anzahlBestellungenNeu, anzahlBestellungen);
        
    }
    
    /**
     * Hier wird die Grösse der bestellten Produkte getestet
     */
    @Test
    public void testAnzahlProdukte()
    {
        Fabrik testFabrik = new Fabrik();
        testFabrik.bestellungAufgeben(2,2);
        Bestellung bestellung = testFabrik.bestellungen.get(0);
        assertEquals(bestellung.bestellteProdukte.size(), 10);
        
    }
}
