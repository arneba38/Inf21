
/**
 * Beschreibung der Klasse ABSCHLUSS
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class ABSCHLUSS extends LISTENELEMENT
{
    /**
    * F&uuml;gt ein Datenelement am Ende der Liste ein
    * @param dneu neues Datenelement
    */
    KNOTEN HintenEinfuegen(DATENELEMENT dneu)
    {
        KNOTEN kneu;
        kneu = new KNOTEN(dneu, this);
        return kneu;
    }
    
    
    /**
    * F&uuml;gt ein Datenelement vor einem bestimmten anderen Datenelement ein
    * @param dneu neues Datenelement
    * @param d_vergleich gesuchtes Datenelement, vor dem eingef&uuml;gt werden soll
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    KNOTEN EinfuegenVor(DATENELEMENT dneu, DATENELEMENT d_vergleich)
    {
        return HintenEinfuegen(dneu);
    }
    
    /**
    * F&uuml;gt ein Datenelement sortiert in die Liste ein
    * @param dneu neues Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    KNOTEN SortiertEinfuegen(DATENELEMENT dneu)
    {
        return HintenEinfuegen(dneu);
    }  
    
    /**
    * Entfernt einen Knoten, der &uuml;ber sein Datenelement identifiziert wird, aus der Liste
    * @param dvergleich gesuchtes Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    LISTENELEMENT KnotenEntfernen(DATENELEMENT dvergleich)
    {       
        return null;
    }  

    /**
    * Gibt das Datenelement des letzten Knotens aus
    * @return hinterstes Datenelement (Vorg&auml;nger von Abschluss)
    */
    DATENELEMENT EndeGeben(DATENELEMENT d)
    {
        return d;
    }  
    
    
    /**
    * Gibt den letzten Knoten aus und entfernt ihn aus der Liste
    * @return bisheriger letzter Knoten
    */
    LISTENELEMENT EndeEntfernen(DATENELEMENT d)
    {
        return this;
    }  
 
     /**
     * Gibt Information &uuml;ber das Datenelement und den Nachfolger des Knotens aus.
     */
    void InformationAusgeben()
    {
    }

    /**
     * Sucht ein Datenelement, das über seinen Schl&uuml;ssel identifiziert wird, und gibt es aus.
     * @param vergleichswert Schl&uuml;ssel vom Typ String
     * @return gesuchtes Datenelement
    */
    DATENELEMENT Suchen(String vergleichswert)
    {
        return null;
    }  

     /**
     * Gibt die L&auml;nge der Restliste aus
     * @return L&auml;nge der Restliste
    */
    int RestlaengeGeben()
    {
        return 0;
    }  
    
     /**
     * Gibt eine Referenz auf das Datenelement aus
     * @return Datenelement
    */
    DATENELEMENT DatenelementGeben()
    {
        return null;
    }

     /**
     * Gibt eine Referenz auf den Nachfolger aus
     * @return Nachfolger
    */
    LISTENELEMENT NachfolgerGeben()
    {
        return this;
    }
}
