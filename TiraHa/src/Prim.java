
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Tämä luokka on vastuussa vierusmatriisin tulostamisesta ja verkon virittämisestä.
 * @author Lauri Suomalainen
 */
public class Prim {

    int[][] vierusmatriisi;
    int[][] viritettypuu;

/*
     * Tulostaa vierusmatriisiesityksen verkosta.
     */
    public void tulostavierusmatriisi(Solmu[] verkko) {
        vierusmatriisi = new int[verkko.length][verkko.length];
        for (int i = 0; i < verkko.length; i++) {
            for (int j = 0; j < verkko.length; j++) {
                if (verkko[i].vieruslista.containsKey(verkko[j])) {
                    vierusmatriisi[i][j] = verkko[i].vieruslista.get(verkko[j]);
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
     * Suorittaa primin algoritmin verkolle, tallettaen tulokset solmujen primlistaan.
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
                if (u.vieruslista.containsKey(verkko2[i]) && heap.contains(verkko2[i]) && u.vieruslista.get(verkko2[i]) < verkko2[i].distance) {
                    verkko2[i].muutaParent(u);
                    verkko2[i].distance = u.vieruslista.get(verkko2[i]);
                    heap.remove(verkko2[i]);
                    heap.add(verkko2[i]);
                }
            }
        }
        for (int i = 0; i < verkko2.length; i++) {
            verkko2[i].vieruslista.clear();
            if (verkko2[i].getParent() != null) {
                verkko2[i].lisaaprim(verkko2[i].distance, verkko2[i].getParent());
                Solmu u = verkko2[i].getParent();
                u.lisaaprim(verkko2[i].distance, verkko2[i]);
            }
        }
        return verkko2;
    }
    /**
     * Sama kuin tulosta vierusmatriisi, mutta käyttää primlistaa vieruslistan sijasta.
     * @param verkko
     */
    public void tulostaprim(Solmu[] verkko) {
        vierusmatriisi = new int[verkko.length][verkko.length];
        for (int i = 0; i < verkko.length; i++) {
            for (int j = 0; j < verkko.length; j++) {
                if (verkko[i].primlista.containsKey(verkko[j])) {
                    vierusmatriisi[i][j] = verkko[i].primlista.get(verkko[j]);
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

}
