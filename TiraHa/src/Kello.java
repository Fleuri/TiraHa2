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

    public static void primStart() {
        primAlku = System.nanoTime();
    }

    public static void primStop() {
        primLoppu = System.nanoTime();
        primTotal = primLoppu - primAlku;
    }

    public static void kruskalStart() {
        kruskalAlku = System.nanoTime();
    }

    public static void kruskalStop() {
        kruskalLoppu = System.nanoTime();
        kruskalTotal = kruskalLoppu - kruskalAlku;
    }

    public static String tulostaTiedot() {
        double prosentti =  ((double)((primTotal <= kruskalTotal) ? primTotal : kruskalTotal) / ((double)((primTotal >= kruskalTotal) ? primTotal : kruskalTotal)) * 100.0);
        if (primTotal < kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " nanosekuntia\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " nanosekuntia\n"
                    + "Prim oli " + prosentti + " prosenttia nopeampi";
        } else if (primTotal > kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " nanosekuntia\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " nanosekuntia\n"
                    + "Kruskal oli " + prosentti + " prosenttia nopeampi";
        } else {
            return "Näin ei pitänyt käydä. Algoritmit olivat yhtä nopeita (!) tai todennäköisemmin tapahtui virhe";
        }
    }
}
