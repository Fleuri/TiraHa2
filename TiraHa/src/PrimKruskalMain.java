/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PrimKruskalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solmu A = new Solmu("A");
        Solmu B = new Solmu("B");
        Solmu C = new Solmu("C");
        Solmu D = new Solmu("D");
        A.lisaavierus(1, B);
        A.lisaavierus(6, D);
        B.lisaavierus(1, A);
        B.lisaavierus(5, C);
        B.lisaavierus(6, D);
        C.lisaavierus(5, B);
        C.lisaavierus(5, D);
        D.lisaavierus(6, B);
        D.lisaavierus(5, C);
        D.lisaavierus(6, A);
        Solmu[] verkko = {A,B,C,D};
        Prim prim = new Prim();
        prim.tulostavierusmatriisi(verkko);
        
        System.out.println("");
        System.out.print("Henkilöiden ikien absoluuttiset erotukset");
        System.out.println("");
        System.out.println("");
        
        Solmu lauri = new Solmu("Lauri");
        Solmu miia = new Solmu ("Miia");
        Solmu miika = new Solmu("Miika");
        Solmu markus = new Solmu("Markus");
        Solmu miikka = new Solmu("Miikka");
        lauri.lisaavierus(0, miia);
        lauri.lisaavierus(2, miika);
        lauri.lisaavierus(4, markus);
        lauri.lisaavierus(3, miikka);
        miia.lisaavierus(0, lauri);
        miia.lisaavierus(2, miika);
        miia.lisaavierus(4, markus);
        miia.lisaavierus(3, miikka);
        miika.lisaavierus(2, lauri);
        miika.lisaavierus(2, miia);
        miika.lisaavierus(2, markus);
        miika.lisaavierus(1, miikka);
        markus.lisaavierus(4, lauri);
        markus.lisaavierus(4, miia);
        markus.lisaavierus(1, miikka);
        markus.lisaavierus(2, miika);
        miikka.lisaavierus(3, lauri);
        miikka.lisaavierus(3, miia);
        miikka.lisaavierus(1, miika);
        miikka.lisaavierus(1, markus);
        Solmu[] verkko2 = {lauri, miia, miika, markus, miikka};
        prim.tulostavierusmatriisi(verkko2);
    }
}
