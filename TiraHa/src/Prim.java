
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Tämä luokka on vastuussa vierusmatriisin tulostamisesta ja verkon
 * virittämisestä.
 *
 * @author Lauri Suomalainen
 */
public class Prim {

    int[][] vierusmatriisi;
    int[][] viritettypuu;

    /*
     * Tulostaa vierusmatriisiesityksen verkosta.
     */
    /**
     * 
     * @param verkko
     */
    public void tulostavierusmatriisi(Solmu[] verkko) {
        vierusmatriisi = new int[verkko.length][verkko.length];
        for (int i = 0; i < verkko.length; i++) {
            for (int j = 0; j < verkko.length; j++) {
               // if (verkko[i].vieruslista.containsKey(verkko[j])) {
                if (verkko[i].vieruslista.contains(verkko[j])) {
                    //vierusmatriisi[i][j] = verkko[i].vieruslista.get(verkko[j]);
                    vierusmatriisi[i][j] = verkko[i].vieruslista.getPituus(verkko[j]);
                } else if (verkko[i] == verkko[j]) {
                    vierusmatriisi[i][j] = 0;
                } else {
                    vierusmatriisi[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        System.out.print("[   ]");
        for (int i = 0; i < verkko.length; i++) {
            System.out.print("[ " + verkko[i].tulostanimi() + " ]");
        }
        for (int i = 0; i < vierusmatriisi.length; i++) {
            System.out.println("");
            System.out.print("[ " + verkko[i].tulostanimi() + " ]");
            for (int j = 0; j < vierusmatriisi[i].length; j++) {
                if (vierusmatriisi[i][j] == Integer.MAX_VALUE) {
                    System.out.print("[ ∞ ]");
                } else {
                    System.out.print("[ " + vierusmatriisi[i][j] + " ]");
                }
            }
        }
        System.out.println("");
    }

    /**
     * Suorittaa primin algoritmin verkolle, tallettaen tulokset solmujen
     * primlistaan.
     *
     * @param verkko
     * @return
     */
    public Solmu[] primAlgoritmi(Solmu[] verkko) {
        Solmu[] verkko2 = verkko;

        PriorityQueue<Solmu> heap = new PriorityQueue();
        for (int i = 0; i < verkko2.length; i++) {
            verkko2[i].nollaaParent();
            verkko2[i].distance = Integer.MAX_VALUE;
        }
        verkko2[0].distance = 0;
        for (int i = 0; i < verkko2.length; i++) {
            heap.add(verkko2[i]);
        }
        while (!heap.isEmpty()) {
            Solmu u = heap.poll();
            //if (u.getParent() != null){
            for (int i = 0; i < verkko2.length; i++) {
                //if (u.vieruslista.containsKey(verkko2[i]) && heap.contains(verkko2[i]) && u.vieruslista.get(verkko2[i]) < verkko2[i].distance) {
                if (u.vieruslista.contains(verkko2[i]) && heap.contains(verkko2[i]) && u.vieruslista.getPituus(verkko2[i]) < verkko2[i].distance) {
                    verkko2[i].muutaParent(u);
                    //verkko2[i].distance = u.vieruslista.get(verkko2[i]);
                    verkko2[i].distance = u.vieruslista.getPituus(verkko2[i]);
                    heap.remove(verkko2[i]);
                    heap.add(verkko2[i]);
                }
            }
        }
        for (int i = 0; i < verkko2.length; i++) {

            if (verkko2[i].getParent() != null) {
                verkko2[i].lisaaprim(verkko2[i].distance, verkko2[i].getParent());
                Solmu u = verkko2[i].getParent();
                u.lisaaprim(verkko2[i].distance, verkko2[i]);
            }
        }
        return verkko2;
    }

    /**
     * Sama kuin tulosta vierusmatriisi, mutta käyttää primlistaa vieruslistan
     * sijasta.
     *
     * @param verkko
     */
    public void tulostaprim(Solmu[] verkko) {
        vierusmatriisi = new int[verkko.length][verkko.length];
        for (int i = 0; i < verkko.length; i++) {
            for (int j = 0; j < verkko.length; j++) {
              //  if (verkko[i].primlista.containsKey(verkko[j])) {
                if (verkko[i].primlista.contains(verkko[j])) {
                    //vierusmatriisi[i][j] = verkko[i].primlista.get(verkko[j]);
                    vierusmatriisi[i][j] = verkko[i].primlista.getPituus(verkko[j]);
                } else if (verkko[i] == verkko[j]) {
                    vierusmatriisi[i][j] = 0;
                } else {
                    vierusmatriisi[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        System.out.print("[   ]");
        for (int i = 0; i < verkko.length; i++) {
            System.out.print("[ " + verkko[i].tulostanimi() + " ]");
        }
        for (int i = 0; i < vierusmatriisi.length; i++) {
            System.out.println("");
            System.out.print("[ " + verkko[i].tulostanimi() + " ]");
            for (int j = 0; j < vierusmatriisi[i].length; j++) {
                if (vierusmatriisi[i][j] == Integer.MAX_VALUE) {
                    System.out.print("[ ∞ ]");
                } else {
                    System.out.print("[ " + vierusmatriisi[i][j] + " ]");
                }
            }
        }
        System.out.println("");
    }

    /**
     * Etsii verkosta kaaret ja palauttaa ne järjestettynä taulukkona.
     * @param verkko
     * @return
     */
    public Kaari[] getKaaret(Solmu[] verkko) {
        int kaarilaskuri = 0;
        Kaari[] kaaret = new Kaari[verkko.length * (verkko.length - 1) / 2];
        for (int i = 0; i < verkko.length; i++) {
            for (int k = 0; k < verkko.length; k++) {
                if (kaaritarkistus(kaaret, verkko[i], verkko[k], kaarilaskuri)) {
                    continue;
                } //else if (verkko[i].vieruslista.containsKey(verkko[k])) {
                else if (verkko[i].vieruslista.contains(verkko[k])) {
                    //kaaret[kaarilaskuri] = new Kaari(verkko[i], verkko[k], verkko[i].vieruslista.get(verkko[k]));
                    kaaret[kaarilaskuri] = new Kaari(verkko[i], verkko[k], verkko[i].vieruslista.getPituus(verkko[k]));
                    kaarilaskuri++;

                }
            }
        }
        Kaari[] kaaret2 = new Kaari[kaarilaskuri];
        for (int i = 0; i < kaarilaskuri; i++) {
            kaaret2[i] = kaaret[i];
        }
        mergesort(kaaret2, 0, kaaret2.length);
        return kaaret2;
    }
/*
 * Tarkistaa, että tarkasteltavien solmujen välinen kaari ei ole vielä lisätty
 * kaaritaulukkoon. Palauttaa true, jos on, false jos ei.
 */
    private boolean kaaritarkistus(Kaari[] kaaret, Solmu a, Solmu b, int kaarilaskuri) {
        if (a == b) {
            return true;
        }
        for (int i = 0; i < kaarilaskuri; i++) {
            if ((kaaret[i].a == a || kaaret[i].b == a) && (kaaret[i].a == b || kaaret[i].b == b)){
                return true;
            }
        } return false;
    }
    /*
     * Mergesort, joka järjestää kaaret niiden painojen mukaan.
     */
    private void mergesort(Kaari[] kaaret2, int vasen, int oikea) {
        if (vasen < oikea) {
            int keski = (vasen + oikea)/2;
            mergesort(kaaret2, vasen, keski);
            mergesort(kaaret2, keski + 1, oikea);
            merge(kaaret2, vasen, keski, oikea);
        }
    }
/*
 * Mergesortin liitosmetodi.
 */
    private void merge(Kaari[] kaaret2, int vasen, int keski, int oikea) {
        Kaari iso = new Kaari(new Solmu("solmu"), new Solmu("solmu"), Integer.MAX_VALUE);
        int n1 = keski-vasen + 1;
        int n2 = oikea - keski;
        Kaari[] left = new Kaari[n1 + 1];
        Kaari[] right = new Kaari[n2 + 1];
        for (int i = 0; i < n1; i++)
        {
            left[i] = kaaret2[vasen + i];
            
        }left[n1] = iso;
        for (int i = 0; i < n2; i++) {
            right[i] = kaaret2[keski + i];
        } right[n2] = iso;
        int i = 0;
        int j = 0;
        for (int k = vasen; k < oikea; k++) {
            if (left[i].matka <= right[j].matka){
                kaaret2[k] = left[i];
                i++;
        } else {
                kaaret2[k] = right[j];
                j++;
            }
    }
}
public void Kruskal(Solmu[] verkko) {
    Kaari[] kaaret = getKaaret(verkko);
    Palahajautustaulu palat = new Palahajautustaulu();
    for (int i = 0; i < verkko.length; i++) {
       palat.insert(new Pala(verkko[i], verkko.length, kaaret.length));
    }
    for (int i = 0; i < kaaret.length; i++) {
        
    }
}
}