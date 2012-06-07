/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Hajautusapu {
    public Solmu solmu;
    public int pituus;
    public boolean isEmpty;
    
    public Hajautusapu(Solmu solmu, int pituus) {
        this.solmu = solmu;
        this.pituus = pituus;
        isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
    public void changeisEmpty() {
        if (isEmpty == true) {
            isEmpty = false;
        } else {
            isEmpty = true;
        }
    }
}
