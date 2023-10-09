
/**
 * Die Klasse "Stuhl" ist eine Erweiterung der Klasse "Produkt".
 * Sie enthält die Materialien, welche für die Produktion der Instanzen der Klasse "Stuhl" benötigt werden.
 * Zudem können entsprechende Methoden aufgerufen werden, um die Informationen über die benötigten Materialien einzusehen.
 * 
 * @author Simon  Fürst
 * @version 1, Datum: 03.10.2023
 */
public class Stuhl extends Produkt
{
    // Instanzvariablen

    private static int produktionsZeit;
    private static int holz;
    private static int schrauben;
    private static int farbe;
    private static int karton;

    /**
     * Konstruktor für Objekte der Klasse Stuhl
     * Hier werden die Materialien und die Produktionszeit für die Instanz Stuhl zugewiesen.
     */
    public Stuhl()
    {
        // Instanzvariable
        produktionsZeit = 22;
        holz = 2;
        schrauben = 10;
        farbe = 2;
        karton = 1;
    }

    /**
     * Methode: Abrufen der benötigten Produktionszeit
     * @return: integer
     */
    public int gibBenötigteProduktionszeit()
    {
        return produktionsZeit;
    }
    
    /**
     * Methode: Abrufen der benötigten Einheiten an Holz
     * @return: integer
     */
    public int gibBenötigteEinheitenHolz()
    {
        return holz;
    }
    
    /**
     * Methode: Abrufen der benötigten Schrauben
     * @return: integer
     */
    public int gibBenötigteSchrauben()
    {
        return schrauben;
    }

    /**
     * Methode: Abrufen der benötigten Einheiten an Farbe
     * @return: integer
     */
    public int gibBenötigteEinheitenFarbe()
    {
        return farbe;
    }
    
    /**
     * Methode: Abrufen der benötigten Einheiten an Karton
     * @return: integer
     */
    public int gibBenötigteEinheitenKarton()
    {
        return karton;
    }
}
