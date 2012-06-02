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
    Solmu tunnussolmu;
    int pituus;
    
    public Pala(Solmu solmu, int pituus) {
        pala = new Solmu[pituus];
        tunnussolmu = solmu;
        pala[0] = solmu;
        pituus = 1;
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
}
