/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
}
