/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Pala {
    public Solmu[] pala;
    Kaari[] kaaret;
    int pituus;
    public boolean isEmpty;
    
    public Pala(Solmu solmu, int pituus, int kaariluku) {
        pala = new Solmu[pituus];
        pala[0] = solmu;
        this.pituus = 1;
        kaaret = new Kaari[kaariluku];
        isEmpty = false;
    }
    public boolean onkoSama(Pala toinenpala) {
        for (int i = 0; i < pituus; i++) {
            for (int j = 0; j < toinenpala.pituus; j++) {
               if (toinenpala.pala[j] == pala[i]) {
                    break;
                } else if (j == toinenpala.pituus) {
                    return false;
                }
            } 
        } return true;
    }
    public void yhdista(Pala toinenpala) {
        
    }
    public boolean contains (Solmu solmu) {
        for (int i = 0; i < pala.length; i++) {
            if (pala[i] == solmu) {
                return true;
            }
        }
        return false;
    }
}
