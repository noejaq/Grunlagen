
/**
 * Die Klasse "Produkt" enthält den Zustand der Produkte (Stühle und Sofas).
 * Zudem werden die Eigenschaften der Produkte definiert.
 * 
 * @author Simon Fürst 
 * @version 1, Datum: 03.10.2023
 */
public class Produkt
{
    // Instanzvariablen
    public int zustand;
    
    /**
     * Konstruktor für die Objekte der Klasse Produkt.
     * Der Zustand wird hier mit dem Wert = 1 initialisiert. 
     * Das bedeutet, dass das Produkt bestellt wurde. 
     */
    public Produkt()
    {
        // Instanzvariable initialisieren
        zustand = 1;
    }

    /**
     * Methode: Ermöglicht den Zustand des Produkts zu ändern
     * @parameter: integer
     */
    public void zustandAendern(int neuerZustand)
    {
        zustand = neuerZustand;
    }
    
    /**
     * Methode: Abrufen und ausweisen des Zustands eines Produkts auf der Konsole
     */
    public int gibZustand()
    {
        if(zustand == 1)
        {
            System.out.println("Das Produkt wurde bestellt");
            return zustand;
        }
        else if(zustand == 2)
        {
            System.out.println("Das Produkt ist in Produktion");
            return zustand;
        }
        else if(zustand == 3)
        {
            System.out.println("Das Produkt wird geliefert");
            return zustand;
        }
        else if(zustand == 4)
        {
            System.out.println("Das Produkt wurde zugestellt");
            return zustand;
        }
        else
        {
            System.out.println("Unbekannt – Undefinierter Zustand");
            return zustand;
        }
    }
}
