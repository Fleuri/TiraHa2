/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
import java.util.HashMap;

public class Solmu implements Comparable {

    public HashMap<Solmu, Integer> vieruslista;
    private String nimi;
    private Solmu parent;
    public int distance;

    public Solmu(String nimi) {
        vieruslista = new HashMap<>();
        this.nimi = nimi;
        parent = null;
    }

    public void lisaavierus(int etaisyys, Solmu solmu) {
        vieruslista.put(solmu, etaisyys);
    }

    public String tulostanimi() {
        return nimi;
    }

    public void nollaaParent() {
        parent = null;
    }

    public void muutaParent(Solmu solmu) {
        parent = solmu;
    }

    public Solmu getParent() {
        return parent;
    }

    @Override
    public int compareTo(Object o) {
        assert (o instanceof Solmu);
        if (this.distance == ((Solmu) o).distance) {
            return 0;
        } else if (this.distance < ((Solmu) o).distance) {
            return 1;
        } else {
            return -1;
        }
    }
}
