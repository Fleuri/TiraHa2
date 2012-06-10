/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lauri
 */
public class Heap {

    Solmu[] solmut;
    int heapSize;

    public Heap(int taulukonKoko) {
        solmut = new Solmu[taulukonKoko];
        heapSize = -1;
    }

    private int parent(int indeksi) {
        double i = indeksi / 2;
        return (int) i;
    }

    private int left(int indeksi) {
        return 2 * indeksi;
    }

    private int right(int indeksi) {
        return 2 * indeksi + 1;
    }

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

    public void insert(Solmu solmu) {
        if (heapSize == -1) {
            heapSize++;
            solmut[0] = solmu;
            return;
        }
        heapSize++;
        int i = heapSize;
        while (i > 0 && solmut[parent(i)].distance > solmu.distance) {
            solmut[i] = solmut[parent(i)];
            i = parent(i);
        }
        solmut[i] = solmu;
    }

    public Solmu poll() {
        Solmu min = solmut[0];
        solmut[0] = solmut[heapSize];
        heapSize--;
        heapify(0);
        return min;
    }

    public boolean isEmpty() {
        return heapSize <= -1 ? true : false;
    }

    public boolean contains(Solmu solmu) {
        for (int i = 0; i < heapSize + 1; i++) {
            if (solmut[i] == solmu) {
                return true;
            }
        }
        return false;
    }
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
