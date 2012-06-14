/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class PrimKruskalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Algoritmit prim = new Algoritmit();
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
        
        prim.tulostavierusmatriisi(verkko);
        prim.primAlgoritmi(verkko);
        System.out.println("");
        System.out.println("Primin tulos:");
        System.out.println("");
        prim.tulostaprim(verkko);
        prim.Kruskal(verkko);
        System.out.println("");
        System.out.println("Kruskalin tulos:");
        System.out.println("");
        prim.tulostaprim(verkko);
        System.out.println("");
        System.out.println(Kello.tulostaTiedot());
        System.out.println("");
        Solmu A2 = new Solmu("A");
        Solmu B2 = new Solmu("B");
        Solmu C2 = new Solmu("C");
        Solmu D2 = new Solmu("D");
        Solmu E2 = new Solmu("E");
        A2.lisaavierus(13, D2);
        D2.lisaavierus(13, A2);
        D2.lisaavierus(13, B2);
        B2.lisaavierus(13, D2);
        D2.lisaavierus(9, C2);
        C2.lisaavierus(9, D2);
        D2.lisaavierus(4, E2);
        E2.lisaavierus(4, D2);
        B2.lisaavierus(12, C2);
        C2.lisaavierus(12, B2);
        C2.lisaavierus(6, E2);
        E2.lisaavierus(6, C2);
        Solmu[] verkko2 = {A2,B2,C2,D2,E2};
        prim.tulostavierusmatriisi(verkko2);
        prim.primAlgoritmi(verkko2);
        System.out.println("");
        System.out.println("Primin tulos:");
        System.out.println("");
        prim.tulostaprim(verkko2);
        prim.Kruskal(verkko2);
        System.out.println("");
        System.out.println("Kruskalin tulos:");
        System.out.println("");
        prim.tulostaprim(verkko2);
        System.out.println("");
        System.out.println(Kello.tulostaTiedot());
        System.out.println("");
        
        /*System.out.println("");
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
        prim.tulostavierusmatriisi(verkko2); */
    }
}
