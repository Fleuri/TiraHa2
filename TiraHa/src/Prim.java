
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Lauri Suomalainen
 */
public class Prim {

    int[][] vierusmatriisi;
    int[][] viritettypuu;

    /**
     * Antaa arvon vierusmatriisille ja asettaa viritetyn puun alkutilaan.
     *
     * @param vierusmatriisi
     */
    /*
     * public Prim(Solmu[] verkko) { viritettypuu = new
     * int[vierusmatriisi.length][vierusmatriisi[0].length]; for (int i = 0; i <
     * viritettypuu.length; i++) { for (int j = 0; j < viritettypuu[i].length;
     * j++) { viritettypuu[i][j] = Integer.MAX_VALUE; } } }
     */
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

    public Solmu[] primAlgoritmi(Solmu[] verkko) {
        Solmu[] loppuverkko = new Solmu[verkko.length];
        Solmu[] verkko2 = verkko.clone();
        PriorityQueue<Solmu> heap = new PriorityQueue();
        for (int i = 0; i < verkko2.length; i++) {
            verkko2[i].nollaaParent();
            verkko2[i].distance = Integer.MAX_VALUE;
        }
        verkko[0].distance = 0;
        for (int i = 0; i < verkko2.length; i++) {
            heap.add(verkko2[i]);
        }
        while (!heap.isEmpty()) {
            Solmu u = heap.poll();
            //if (u.getParent() != null){
            for (int i = 0; i < verkko2.length; i++) {
                if (u.vieruslista.containsKey(verkko2[i]) && heap.contains(verkko2[i]) && u.vieruslista.get(verkko2[i]) < verkko[2].distance) {
                    verkko2[i].muutaParent(u);
                    verkko2[i].distance = u.vieruslista.get(verkko2[i]);
                }
            }
        }
        for (int i = 0; i < verkko2.length; i++) {
            verkko2[i].vieruslista.clear();
            if (verkko2[i].getParent() != null) {
                verkko2[i].lisaavierus(verkko2[i].distance, verkko2[i].getParent());
                Solmu u = verkko2[i].getParent();
                u.lisaavierus(verkko2[i].distance, verkko2[i]);
            }
        }
        return verkko2;
    }
}
