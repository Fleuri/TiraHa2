/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lauri
 */
public class Kello {

    static long primAlku;
    static long primLoppu;
    static long primTotal;
    static long kruskalAlku;
    static long kruskalLoppu;
    static long kruskalTotal;

    /**
     * 
     */
    public static void primStart() {
        primAlku = System.nanoTime();
    }

    /**
     * 
     */
    public static void primStop() {
        primLoppu = System.nanoTime();
        primTotal = primLoppu - primAlku;
    }

    /**
     * 
     */
    public static void kruskalStart() {
        kruskalAlku = System.nanoTime();
    }

    /**
     * 
     */
    public static void kruskalStop() {
        kruskalLoppu = System.nanoTime();
        kruskalTotal = kruskalLoppu - kruskalAlku;
    }

    /**
     * 
     * @return
     */
    public static String tulostaTiedot() {
        double prosentti = (100 - ((double)((primTotal <= kruskalTotal) ? primTotal : kruskalTotal) / ((double)((primTotal >= kruskalTotal) ? primTotal : kruskalTotal)) * 100.0));
        if (primTotal < kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " nanosekuntia.\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " nanosekuntia.\n"
                    + "Prim käytti " + prosentti + " prosenttia vähemmän aikaa kuin Kruskal.";
        } else if (primTotal > kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " nanosekuntia.\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " nanosekuntia.\n"
                    + "Kruskal käytti " + prosentti + " prosenttia vähemmän aikaa kuin Prim.";
        } else {
            return "Näin ei pitänyt käydä. Algoritmit olivat yhtä nopeita (!) tai todennäköisemmin tapahtui virhe.";
        }
    }
}
