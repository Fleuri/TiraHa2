/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
import java.util.HashMap;

/**
 * Solmu olio, joka säilyttää tiedot viereisistä solmuista ja myös Primin algoritmiin tarvittavat tiedot.
 * @author Acer
 */
public class Solmu implements Comparable {

    /**
     * Säilyttää verkossa viereiset solmut ja kaarenpainot.
     */
    //public HashMap<Solmu, Integer> vieruslista;
       public Hajautustaulu vieruslista;
    /**
     * Säilyttää kaaret, joilla voidaan tulostaa viritetty puu.
     */
    //public HashMap<Solmu, Integer> primlista;
       public Hajautustaulu primlista;
    private String nimi;
    private Solmu parent;
    /**
     * Matka lähimpään solmuun. Käytetään primissä.
     */
    public int distance;

    /**
     * Solmun konstruktori, jossa solmulle annetaan nimi ja muut kentät asetetaan alkutilaan.
     * @param nimi
     */
    public Solmu(String nimi) {
       // vieruslista = new HashMap<>();
        vieruslista = new Hajautustaulu();
       // primlista = new HashMap<>();
        primlista = new Hajautustaulu();
        this.nimi = nimi;
        parent = null;
    }

    /**
     * Lisää vieruslistaan solmun ja etäisyyden.
     * @param etaisyys
     * @param solmu
     */
    public void lisaavierus(int etaisyys, Solmu solmu) {
        vieruslista.insert(solmu, etaisyys);
    }
    /**
     * Sama kuin lisaavierus, mutta käytetään primissä.
     * @param etaisyys
     * @param solmu
     */
    public void lisaaprim(int etaisyys, Solmu solmu) {
        primlista.insert(solmu, etaisyys);
    }
    /**
     * Tulostaa solmun nimen.
     * @return
     */
    public String tulostanimi() {
        return nimi;
    }

    /**
     * Vaihtaa parentin arvoksi null.
     */
    public void nollaaParent() {
        parent = null;
    }

    /**
     * Vaihtaa parentin arvoksi parametrina annetun solmun.
     * @param solmu
     */
    public void muutaParent(Solmu solmu) {
        parent = solmu;
    }

    /**
     * Palauttaa parent-solmun
     * @return
     */
    public Solmu getParent() {
        return parent;
    }

    /**
     * Vertailee solmujen distance arvoja. Käytetään, jos käytössä Priorityqueue.
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        assert (o instanceof Solmu);
        if (this.distance == ((Solmu) o).distance) {
            return 0;
        } else if (this.distance < ((Solmu) o).distance) {
            return -1;
        } else {
            return 1;
        }
    }
    /**
     * Nollaa Primlistan.
     */
    public void nollaaPrimlista() {
        primlista = new Hajautustaulu();
    }
}
