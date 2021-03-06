
/**
 * Beschreibung zum Interface DATENELEMENT
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */

interface DATENELEMENT
{
    /**
     * Ausgabe von Information &uuml;ber ein Ausgabefenster
     */
    void InformationAusgeben();
    
     /**
     * Vergleich zweier Datenelemente bez&uuml;glich einer Ordnungsrelation
     * @param dvergleich Datenelement zum Vergleich
     */
    boolean IstKleinerAls(DATENELEMENT dvergleich);

     /**
     * Identifikation eines Datenelements aufgrund seines Schl&uuml;ssels
     * @param s Schl&uuml;ssel vom Typ String
     */
    boolean SchluesselIstGleich(String s);
}
