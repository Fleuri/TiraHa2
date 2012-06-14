/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Tämä luokka säilyttää solmut ja niiden välisen kaaren painot.
 * @author Lauri Suomalainen
 */
public class Kaari {
    /**
     * Kaaren ensimmäinen solmu.
     */
    public Solmu a;
    /**
     * Kaaren toinen solmu
     */
    public Solmu b;
    int matka;
    
    /**
     * Konstruktori.
     * @param a
     * @param b
     * @param matka
     */
    public Kaari(Solmu a, Solmu b, int matka) {
        this.a = a;
        this.b = b;
        this.matka = matka;
    }
}
