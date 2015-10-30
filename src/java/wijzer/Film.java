/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wijzer;

/**
 *
 * @author Jeffrey
 */
public class Film {
    private int nummer;
    private String titel;
    private Kijkwijzer kijken;

    public Film(int nummer, String titel, String kijk) {
        this.nummer = nummer;
        this.titel = titel;
        kijken = new Kijkwijzer(kijk);
    }

    public int getNummer() {
        return nummer;
    }

    public String getTitel() {
        return titel;
    }

    public Kijkwijzer getKijken() {
        return kijken;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setKijken(Kijkwijzer kijken) {
        this.kijken = kijken;
    }    
    
    public String getKijkwijzer(){
        String s="";
        
        s = ""+kijken.getPlaatjes();
        
        return s;
        
    }
}
