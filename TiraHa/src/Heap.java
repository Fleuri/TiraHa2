/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Minimikeko. Käytetään Primin algoritmissa.
 * @author lauri
 */
public class Heap {

    Solmu[] solmut;
    int heapSize;

    /**
     * Luo taulukon annetun parametrin mukaan. Asettaa heapin koon alkutilaan.
     * Aluksi koko on -1, jolloin heapissa ei ole yhtään alkiota.
     * @param taulukonKoko
     */
    public Heap(int taulukonKoko) {
        solmut = new Solmu[taulukonKoko];
        heapSize = -1;
    }
/*
 * Palauttaa solmun vanhemman indeksin.
 */
    private int parent(int indeksi) {
        double i = indeksi / 2;
        return (int) i;
    }
/*
 * Palautta solmun vasemman lapsen indeksin.
 */
    private int left(int indeksi) {
        return 2 * indeksi;
    }
/*
 * Palauttaa solmun oikean lapsen indeksin.
 */
    private int right(int indeksi) {
        return 2 * indeksi + 1;
    }
/*
 * Palauttaa keon toteuttamaan kekoehdon.
 */
    private void heapify(int indeksi) {
        int smallest;
        int left = left(indeksi);
        int right = right(indeksi);
        if (right <= heapSize) {
            if (solmut[right].distance < solmut[left].distance) {
                smallest = right;
            } else {
                smallest = left;
            }
            if (solmut[indeksi].distance > solmut[smallest].distance) {
                Solmu iSolmu = solmut[indeksi];
                Solmu smallSolmu = solmut[smallest];
                solmut[indeksi] = smallSolmu;
                solmut[smallest] = iSolmu;
                heapify(smallest);
            }
        } else if (left == heapSize && solmut[indeksi].distance > solmut[left].distance) {
            Solmu iSolmu = solmut[indeksi];
            Solmu smallSolmu = solmut[left];
            solmut[indeksi] = smallSolmu;
            solmut[left] = iSolmu;
        }
    }

    /**
     * Asettaa solmun oikealle paikalleen kekoon.
     * @param solmu
     */
    public void insert(Solmu solmu) {
       /* if (heapSize == -1) {
            heapSize++;
            solmut[0] = solmu;
            return;
        }*/
        heapSize++;
        int i = heapSize;
        while (i > 0 && solmut[parent(i)].distance > solmu.distance) {
            solmut[i] = solmut[parent(i)];
            i = parent(i);
        }
        solmut[i] = solmu;
    }

    /**
     * Poistaa ensimmäisenä olevan solmun.
     * @return
     */
    public Solmu poll() {
        Solmu min = solmut[0];
        solmut[0] = solmut[heapSize];
        heapSize--;
        heapify(0);
        return min;
    }

    /**
     * Tarkistaa, onko keossa solmuja.
     * @return
     */
    public boolean isEmpty() {
        return heapSize <= -1 ? true : false;
    }

    /**
     * Tarkistaa, onko annettu solmu keossa.
     * @param solmu
     * @return
     */
    public boolean contains(Solmu solmu) {
        for (int i = 0; i < heapSize + 1; i++) {
            if (solmut[i] == solmu) {
                return true;
            }
        }
        return false;
    }
    /**
     * Poistaa annetun solmun, jos keossa.
     * @param solmu
     */
    public void remove(Solmu solmu) {
        int indeksi = -1;
        for (int i = 0; i < heapSize + 1; i++) {
            if (solmut[i] == solmu) {
                indeksi = i;
                }
        } if (indeksi == -1) {
            return;
        } 
        solmut[indeksi] = solmut[heapSize];
        heapSize--;
        heapify(indeksi);
    }
}
