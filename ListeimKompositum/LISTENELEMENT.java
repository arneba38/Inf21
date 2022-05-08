
/**
 * Beschreibung der abstrakten Klasse LISTENELEMENT
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
abstract class LISTENELEMENT
{
    /**
    * F&uuml;gt ein Datenelement am Ende der Liste ein
    * @param dneu neues Datenelement
    */
    abstract KNOTEN HintenEinfuegen(DATENELEMENT dneu);
    
    
    /**
    * F&uuml;gt ein Datenelement vor einem bestimmten anderen Datenelement ein
    * @param dneu neues Datenelement
    * @param d_vergleich gesuchtes Datenelement, vor dem eingef&uuml;gt werden soll
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    abstract KNOTEN EinfuegenVor(DATENELEMENT dneu, DATENELEMENT d_vergleich);
    
    /**
    * F&uuml;gt ein Datenelement sortiert in die Liste ein
    * @param dneu neues Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    abstract KNOTEN SortiertEinfuegen(DATENELEMENT dneu);
    
    /**
    * Entfernt einen Knoten, der &uuml;ber sein Datenelement identifiziert wird, aus der Liste
    * @param dvergleich gesuchtes Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    abstract LISTENELEMENT KnotenEntfernen(DATENELEMENT dvergleich);

    /**
    * Gibt das Datenelement des letzten Knotens aus
    * @return hinterstes Datenelement
    */
    abstract DATENELEMENT EndeGeben(DATENELEMENT d);
    
    
    /**
    * Gibt den letzten Knoten aus und entfernt ihn aus der Liste
    * @return bisheriger letzter Knoten
    */
    abstract LISTENELEMENT EndeEntfernen(DATENELEMENT d);
 
     /**
     * Gibt Information &uuml;ber das Datenelement und den Nachfolger des Knotens aus.
     */
    abstract void InformationAusgeben();

    /**
     * Sucht ein Datenelement, das über seinen Schl&uuml;ssel identifiziert wird, und gibt es aus.
     * @param vergleichswert Schl&uuml;ssel vom Typ String
     * @return gesuchtes Datenelement
    */
    abstract DATENELEMENT Suchen(String vergleichswert);

     /**
     * Gibt die L&auml;nge der Restliste aus
     * @return L&auml;nge der Restliste
    */
    abstract int RestlaengeGeben();
    
     /**
     * Gibt eine Referenz auf das Datenelement aus
     * @return Datenelement
    */
    abstract DATENELEMENT DatenelementGeben();

     /**
     * Gibt eine Referenz auf den Nachfolger aus
     * @return Nachfolger
    */
    abstract LISTENELEMENT NachfolgerGeben();

}
