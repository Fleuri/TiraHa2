/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author Lauri Suomalainen
 */
public class PrimKruskalMain {

 
    public static void main(String[] args) {
        /*
         * Algoritmit prim = new Algoritmit(); Solmu A = new Solmu("A"); Solmu B
         * = new Solmu("B"); Solmu C = new Solmu("C"); Solmu D = new Solmu("D");
         * A.lisaavierus(1, B); A.lisaavierus(6, D); B.lisaavierus(1, A);
         * B.lisaavierus(5, C); B.lisaavierus(6, D); C.lisaavierus(5, B);
         * C.lisaavierus(5, D); D.lisaavierus(6, B); D.lisaavierus(5, C);
         * D.lisaavierus(6, A); Solmu[] verkko = {A,B,C,D};
         *
         * prim.tulostavierusmatriisi(verkko); prim.primAlgoritmi(verkko);
         * System.out.println(""); System.out.println("Primin tulos:");
         * System.out.println(""); prim.tulostaprim(verkko);
         * prim.Kruskal(verkko); System.out.println("");
         * System.out.println("Kruskalin tulos:"); System.out.println("");
         * prim.tulostaprim(verkko); System.out.println("");
         * System.out.println(Kello.tulostaTiedot()); System.out.println("");
         * Solmu A2 = new Solmu("A"); Solmu B2 = new Solmu("B"); Solmu C2 = new
         * Solmu("C"); Solmu D2 = new Solmu("D"); Solmu E2 = new Solmu("E");
         * A2.lisaavierus(13, D2); D2.lisaavierus(13, A2); D2.lisaavierus(13,
         * B2); B2.lisaavierus(13, D2); D2.lisaavierus(9, C2); C2.lisaavierus(9,
         * D2); D2.lisaavierus(4, E2); E2.lisaavierus(4, D2); B2.lisaavierus(12,
         * C2); C2.lisaavierus(12, B2); C2.lisaavierus(6, E2); E2.lisaavierus(6,
         * C2); Solmu[] verkko2 = {A2,B2,C2,D2,E2};
         * prim.tulostavierusmatriisi(verkko2); prim.primAlgoritmi(verkko2);
         * System.out.println(""); System.out.println("Primin tulos:");
         * System.out.println(""); prim.tulostaprim(verkko2);
         * prim.Kruskal(verkko2); System.out.println("");
         * System.out.println("Kruskalin tulos:"); System.out.println("");
         * prim.tulostaprim(verkko2); System.out.println("");
         * System.out.println(Kello.tulostaTiedot()); System.out.println("");
         */
        /*
         * System.out.println(""); System.out.print("Henkilöiden ikien
         * absoluuttiset erotukset"); System.out.println("");
         * System.out.println("");
         *
         * Solmu lauri = new Solmu("Lauri"); Solmu miia = new Solmu ("Miia");
         * Solmu miika = new Solmu("Miika"); Solmu markus = new Solmu("Markus");
         * Solmu miikka = new Solmu("Miikka"); lauri.lisaavierus(0, miia);
         * lauri.lisaavierus(2, miika); lauri.lisaavierus(4, markus);
         * lauri.lisaavierus(3, miikka); miia.lisaavierus(0, lauri);
         * miia.lisaavierus(2, miika); miia.lisaavierus(4, markus);
         * miia.lisaavierus(3, miikka); miika.lisaavierus(2, lauri);
         * miika.lisaavierus(2, miia); miika.lisaavierus(2, markus);
         * miika.lisaavierus(1, miikka); markus.lisaavierus(4, lauri);
         * markus.lisaavierus(4, miia); markus.lisaavierus(1, miikka);
         * markus.lisaavierus(2, miika); miikka.lisaavierus(3, lauri);
         * miikka.lisaavierus(3, miia); miikka.lisaavierus(1, miika);
         * miikka.lisaavierus(1, markus); Solmu[] verkko2 = {lauri, miia, miika,
         * markus, miikka}; prim.tulostavierusmatriisi(verkko2);
         */
        Solmu[] verkko;
        int lukumaara;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Kuinka monta solmua? (3-26)");
            String luku = scn.next();
            try {
                lukumaara = Integer.parseInt(luku);
                if (lukumaara < 3) {
                    lukumaara = 3;
                } else if (lukumaara > 26) {
                    lukumaara = 26;
                }
                break;
            } catch (Exception e) {
                System.out.println("Anna kokonaisluku");
            }
        }
        char nimi;
        verkko = new Solmu[lukumaara];
        for (int i = 0; i < lukumaara; i++) {
            nimi = (char) (65 + i);
            String nimi2 = Character.toString(nimi);
            verkko[i] = new Solmu(nimi2);
        }

        for (int i = 0; i < lukumaara; i++) {
            scn = new Scanner(System.in);
            System.out.println("Mahdolliset solmut indekseineen");
            for (int j = 0; j < lukumaara; j++) {
                if (!verkko[i].vieruslista.contains(verkko[j]) && verkko[i] != verkko[j]) {
                    System.out.println(verkko[j].tulostanimi() + " = " + j);
                }
            }
            System.out.println("Anna vierussolmut ja matkat solmulle " + verkko[i].tulostanimi() + " muodossa Solmun indeksi-väli-kokonaisluku. Lopeta syöttämällä kirjain");
            int vierus1 = i;
            int vierus2 = Integer.MAX_VALUE;
            while (scn.hasNextInt()) {
                try {
                    vierus1 = (scn.nextInt());
                    vierus2 = scn.nextInt();
                    if (verkko[i] == verkko[vierus1]) {
                        continue;
                    }
                    verkko[i].lisaavierus(vierus2, verkko[vierus1]);
                    verkko[vierus1].lisaavierus(vierus2, verkko[i]);

                } catch (Exception e) {
                    break;
                }

            }
        }

        Algoritmit prim = new Algoritmit();
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
    }
}