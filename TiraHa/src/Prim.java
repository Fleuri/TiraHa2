/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Prim {
    
    int [][] vierusmatriisi;
    int [][] viritettypuu;
    /**
     * Antaa arvon vierusmatriisille ja asettaa viritetyn puun alkutilaan.
     * @param vierusmatriisi 
     */
    public Prim(Verkko verkko) {
        this.vierusmatriisi = vierusmatriisi;
        viritettypuu = new int[vierusmatriisi.length][vierusmatriisi[0].length];
        for (int i = 0; i < viritettypuu.length; i++) {
            for (int j = 0; j < viritettypuu[i].length; j++) {
                viritettypuu[i][j] = Integer.MAX_VALUE;
            }
        }
    }
    
}
