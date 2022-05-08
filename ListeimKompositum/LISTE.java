
/**
 * Beschreibung der Liste
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class LISTE
{
    /** Verwaltung des ersten Knotens in der Warteschlange. */
    private LISTENELEMENT anfang;
    
   
     /**
     * Konstruktor der Liste
     * 
     */
    LISTE()
    {
        anfang = new ABSCHLUSS();        
    }
    
    
     /**
     * F&uuml;gt ein neues Datenelement am Anfang der Liste ein.
     * @param dneu neues Datenelement
     */
    void VorneEinfuegen(DATENELEMENT dneu)
    {
      KNOTEN kneu;
      kneu = new KNOTEN(dneu, anfang);
      anfang = kneu;
    }

     /**
     * F&uuml;gt ein neues Datenelement am Ende der Liste ein.
     * @param dneu neues Datenelement
     */
    void HintenEinfuegen(DATENELEMENT dneu)
    {
        anfang = anfang.HintenEinfuegen(dneu);
    }
    
     /**
     * F&uuml;gt ein neues Datenelement vor einem bestimmten Datenelement ein.
     * @param dneu neues Datenelement
     * @param d_vergleich Datenelement, vor dem eingef&uuml;gt werden soll
     */
    void EinfuegenVor(DATENELEMENT dneu, DATENELEMENT d_vergleich)
    {
        anfang = anfang.EinfuegenVor(dneu, d_vergleich);
    }

     /**
     * F&uuml;gt ein neues Datenelement sortiert in die Liste ein.
     * @param dneu neues Datenelement
     */
    void SortiertEinfuegen(DATENELEMENT dneu)
    {
        anfang = anfang.SortiertEinfuegen(dneu);
    }

     /**
     * Entfernt einen Knoten mit einem bestimmten Datenelement aus der Liste
     * @param dvergleich gesuchtes Datenelement
     */
    void KnotenEntfernen(DATENELEMENT dvergleich)
    {
        anfang = anfang.KnotenEntfernen(dvergleich);
    }

    /**
     * Entfernt den ersten Knoten aus der Liste und gibt sein Datenelement aus.
     * @return Datenelement des bisher ersten Knotens 
     */
    DATENELEMENT AnfangEntfernen()
    {
        DATENELEMENT d;
        d = anfang.DatenelementGeben();
        anfang = anfang.NachfolgerGeben();
        return d;       
    }

     /**
     * Entfernt den letzten Knoten aus der Liste und gibt sein Datenelement aus.
     * @return Datenelement des bisher letzten Knotens 
     */
    DATENELEMENT EndeEntfernen()
    {
        DATENELEMENT d;
        d = anfang.EndeGeben(null);
        anfang = anfang.EndeEntfernen(d);
        return d;
    }
    
     /**
     * Sucht ein Datenelement, das über seinen Schl&uuml;ssel identifiziert wird, und gibt es aus.
     * @param vergleichswert gesuchter Schl&uuml;ssel
     * @return gesuchtes Datenelement
     */
    DATENELEMENT Suchen(String vergleichswert)
    {
        return anfang.Suchen(vergleichswert);
    }
    
     /**
     * Gibt Information &uuml;ber die Liste aus.
     */
    void InformationAusgeben()
    {
        anfang.InformationAusgeben();
    }

     /**
     * Bestimmt die L&auml;nge der Liste und gibt sie aus.
     * @return L&auml;nge der Liste
     */
    int LaengeGeben()
    {
        return anfang.RestlaengeGeben();
    }
    
}
