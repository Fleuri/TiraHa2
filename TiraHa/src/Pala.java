/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Pala {

    public Solmu[] solmut;
    Kaari[] kaaret;
    int kaariluku;
    int solmujenmaara;
    public boolean isEmpty;
    int solmutaulukonpituus;
    
    public Pala(Solmu solmu, int solmutaulukonpituus, int kaariluku) {
        this.solmutaulukonpituus = solmutaulukonpituus;
        solmut = new Solmu[solmutaulukonpituus];
        solmut[0] = solmu;
        solmujenmaara = 1;
        kaaret = new Kaari[kaariluku];
        this.kaariluku = 0;
        isEmpty = false;
    }

    public boolean onkoSama(Pala toinenpala) {
        for (int i = 0; i < solmujenmaara; i++) {
            for (int j = 0; j < toinenpala.solmujenmaara; j++) {
                if (toinenpala.solmut[j] == solmut[i]) {
                    break;
                } else if (j == toinenpala.solmujenmaara) {
                    return false;
                }
            }            
        }
        return true;
    }

    public void lisaasolmu(Solmu solmu) {
        solmut[solmujenmaara] = solmu;
        solmujenmaara++;
    }

    public void lisaakaari(Kaari kaari) {
        kaaret[kaariluku] = kaari;
        kaariluku++;
    }
    
    public void yhdista(Pala toinenpala, Palahajautustaulu taulu, Kaari kaari) {
        Pala uusipala = new Pala(solmut[0], solmutaulukonpituus, kaaret.length);
        for (int i = 1; i < solmujenmaara; i++) {
            uusipala.lisaasolmu(solmut[i]);
        }
        for (int i = 0; i < kaariluku; i++) {
            uusipala.lisaakaari(kaaret[i]);
        }
        for (int i = 0; i < toinenpala.solmujenmaara; i++) {
            uusipala.lisaasolmu(toinenpala.solmut[i]);
        }
        for (int i = 0; i < toinenpala.kaariluku; i++) {
            uusipala.lisaakaari(toinenpala.kaaret[i]);
        }
        taulu.delete(this);
        taulu.delete(toinenpala);
        taulu.insert(uusipala);
    }

    public boolean contains(Solmu solmu) {
        for (int i = 0; i < solmut.length; i++) {
            if (solmut[i] == solmu) {
                return true;
            }
        }
        return false;
    }
}
