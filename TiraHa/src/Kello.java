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
        primAlku = System.currentTimeMillis();
    }

    public static void primStop() {
        primLoppu = System.currentTimeMillis();
        primTotal = primLoppu - primAlku;
    }

    public static void kruskalStart() {
        kruskalAlku = System.currentTimeMillis();
    }

    public static void kruskalStop() {
        kruskalLoppu = System.currentTimeMillis();
        kruskalTotal = kruskalLoppu - kruskalAlku;
    }

    public String tulostaTiedot() {
        int prosentti = (int) (Math.max(primTotal, kruskalTotal) / Math.min(primTotal, kruskalTotal)) * 100;
        if (primTotal > kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " millisekuntia\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " millisekuntia\n"
                    + "Prim oli " + prosentti + " prosenttia nopeampi";
        } else if (primTotal < kruskalTotal) {
            return "Primin algoritmin nopeus: " + primTotal + " millisekuntia\n"
                    + "Kruskalin algoritmin nopeus: " + kruskalTotal + " millisekuntia\n"
                    + "Kruskal oli " + prosentti + " prosenttia nopeampi";
        } else {
            return "Näin ei pitänyt käydä. Algoritmit olivat yhtä nopeita (!) tai todennäköisemmin tapahtui virhe";
        }
    }
}
