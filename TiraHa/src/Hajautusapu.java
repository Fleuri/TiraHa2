/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Apurakennet Hajautustaulu -luokalle.
 * @author Lauri Suomalainen
 */
public class Hajautusapu {
    /**
     * Tallennettu solmu;
     */
    public Solmu solmu;
    /**
     * Kaaren paino
     */
    public int pituus;
    /**
     * Onko tyhjä vai ei.
     */
    public boolean isEmpty;
    
    /**
     * Konstruktori asettaa solmun alkutilaan.
     * @param solmu
     * @param pituus
     */
    public Hajautusapu(Solmu solmu, int pituus) {
        this.solmu = solmu;
        this.pituus = pituus;
        isEmpty = false;
    }

    /**
     * Palauttaa isEmpty -arvon.
     * @return
     */
    public boolean isEmpty() {
        return isEmpty;
    }
    /**
     * Vaihtaa isEmptyn. Mahdollistaan undon, jos implementoitu.
     */
    public void changeisEmpty() {
        if (isEmpty == true) {
            isEmpty = false;
        } else {
            isEmpty = true;
        }
    }
}
