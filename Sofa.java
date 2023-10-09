
/**
 * Die Klasse "Sofa" ist eine Erweiterung der Klasse "Produkt".
 * Sie enthält die Materialien, welche für die Produktion der Instanzen der Klasse "Sofa" benötigt werden.
 * Zudem können entsprechende Methoden aufgerufen werden, um die Informationen über die benötigten Materialien einzusehen.
 * 
 * @author Simon Fürst 
 * @version 1, Datum: 03.10.2023
 */
public class Sofa extends Produkt
{
    // Instanzvariablen
    private static int produktionsZeit;
    private static int holz;
    private static int schrauben;
    private static int kissen;
    private static int farbe;
    private static int karton;

    /**
     * Konstruktor für Objekte der Klasse Sofa
     * Hier werden die Materialien und die Produktionszeit für die Instanz Sofa zugewiesen.
     */
    public Sofa()
    {
        // Instanzvariable initialisieren
        produktionsZeit = 60;
        holz = 4;
        schrauben = 5;
        kissen = 5;
        farbe = 1;
        karton = 5;
    }

    /**
     * Methode: Abrufen der benötigten Produktionszeit
     * @return: integer
     */
    public int gibBenötigteProduktionsZeit()
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
     * Methode: Abrufen der benötigten Kissen
     * @return: integer
     */
    public int gibBenötigteKissen()
    {
        return kissen;
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
