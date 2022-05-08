
/**
 * Beschreibung der Klasse KNOTEN
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class KNOTEN extends LISTENELEMENT
{
    /** Datenelement des Knotens */
    private DATENELEMENT daten;
    
    /** Verwaltung des nachfolgenden Knoten in der Warteschlange. */
    private LISTENELEMENT nachfolger;
     
    /**
    * Konstruktor des Knotens
    * @param d neues Datenelement
    * @param l Nachfolger des Knotens
    */
    KNOTEN(DATENELEMENT d, LISTENELEMENT l)
    {
        daten = d;
        nachfolger = l;
    }

    /**
    * F&uuml;gt ein Datenelement am Ende der Liste ein
    * @param dneu neues Datenelement
    */
    KNOTEN HintenEinfuegen(DATENELEMENT dneu)
    {
        nachfolger = nachfolger.HintenEinfuegen(dneu);
        return this;
    }
    
    
    /**
    * F&uuml;gt ein Datenelement vor einem bestimmten anderen Datenelement ein
    * @param dneu neues Datenelement
    * @param d_vergleich gesuchtes Datenelement, vor dem eingef&uuml;gt werden soll
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    KNOTEN EinfuegenVor(DATENELEMENT dneu, DATENELEMENT d_vergleich)
    {
      if(daten == d_vergleich)
      {
          KNOTEN kneu;
          kneu = new KNOTEN(dneu, this);
          return kneu;
      }
      else
      {
          nachfolger = nachfolger.EinfuegenVor(dneu, d_vergleich);
          return this;
      }
    }
    
    /**
    * F&uuml;gt ein Datenelement sortiert in die Liste ein
    * @param dneu neues Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    KNOTEN SortiertEinfuegen(DATENELEMENT dneu)
    {
        if(daten.IstKleinerAls(dneu))
        {
            nachfolger = nachfolger.SortiertEinfuegen(dneu);
            return this;
        }
        else
        {
            KNOTEN kneu;
            kneu = new KNOTEN(dneu,this);
            return kneu;
        }
    }  
    
    /**
    * Entfernt einen Knoten, der &uuml;ber sein Datenelement identifiziert wird, aus der Liste
    * @param dvergleich gesuchtes Datenelement
    * @return Weitergabe des k&uuml;nftigen Nachfolgers
    */
    LISTENELEMENT KnotenEntfernen(DATENELEMENT dvergleich)
    {
        if(daten == dvergleich)
        {
            return nachfolger;
        }
        else
        {
            nachfolger = nachfolger.KnotenEntfernen(dvergleich);
            return this;
        }
    }  

    /**
    * Gibt das Datenelement des letzten Knotens aus
    * @param d Vorg&auml;nger gibt Referenz auf sein Datenelement mit.
    * @return hinterstes Datenelement
    */
    DATENELEMENT EndeGeben(DATENELEMENT d)
    {
        return nachfolger.EndeGeben(daten);
    }  
    
    
    /**
    * Gibt den letzten Knoten aus und entfernt ihn aus der Liste
    * @return bisheriger letzter Knoten
    */
    LISTENELEMENT EndeEntfernen(DATENELEMENT d)
    {
        if(daten == d)  
        {
            return nachfolger;
        }
        else
        {
            nachfolger = nachfolger.EndeEntfernen(d);
            return this;
        }
       
    }  
 
     /**
     * Gibt Information &uuml;ber das Datenelement und den Nachfolger des Knotens aus.
     */
    void InformationAusgeben()
    {
        daten.InformationAusgeben();
        nachfolger.InformationAusgeben();
    }

    /**
     * Sucht ein Datenelement, das über seinen Schl&uuml;ssel identifiziert wird, und gibt es aus.
     * @param vergleichswert Schl&uuml;ssel vom Typ String
     * @return gesuchtes Datenelement
    */
    DATENELEMENT Suchen(String vergleichswert)
    {
       if(daten.SchluesselIstGleich(vergleichswert))  
        {
            return daten;
        }
        else
        {
            return nachfolger.Suchen(vergleichswert);
        }
    }  

     /**
     * Gibt die L&auml;nge der Restliste aus
     * @return L&auml;nge der Restliste
    */
    int RestlaengeGeben()
    {
        return nachfolger.RestlaengeGeben()+1;
    }  
    
     /**
     * Gibt eine Referenz auf das Datenelement aus
     * @return Datenelement
    */
    DATENELEMENT DatenelementGeben()
    {
        return daten;
    }

     /**
     * Gibt eine Referenz auf den Nachfolger aus
     * @return Nachfolger
    */
    LISTENELEMENT NachfolgerGeben()
    {
        return nachfolger;
    }
}


