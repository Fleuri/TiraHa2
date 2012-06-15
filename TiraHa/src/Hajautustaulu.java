/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Hajautustaulu, joka on tarkoitettu käytettäväksi vieruslistoina.
 * @author Lauri Suomalainen
 */
public class Hajautustaulu {
    Hajautusapu[] lista;
    
    /**
     * Tekee uuden yksitoistapaikkaisen taulukon. 
     */
    public Hajautustaulu(){
        lista = new Hajautusapu[11];
        }
    /**
     * Asettaa solmun listaan validille paikalle. Mikäli lista täyttyy, kutsuu
     * pidennaLista -metodia. Jos solmu löytyy jo listasta, korvaa sen.
     * @param solmu
     * @param pituus
     * @return
     */
    public boolean insert(Solmu solmu, int pituus){
        if (contains(solmu)){
            delete(solmu);
        }
        int i = 0;
        int summa = solmu.hashCode();
        while (true) {
        int sijoitus = (i + summa) % lista.length;
            if (lista[sijoitus] == null || lista[sijoitus].isEmpty()) {
                lista[sijoitus] = new Hajautusapu(solmu, pituus);
                return true;
            } i++;
            if (i == lista.length)
                pidennalista();
        }
    }
    /*
     * Etsii seuraavan alkuluvun ja luo sen pituisen uuden taulukon.
     * Siirtää vanhan taulukon tiedot uuteen.
     */
    private void pidennalista() {
       int i = lista.length + 1;
        while (true) {
            if (isPrime(i)) {
                Hajautusapu[] lista2 = lista;
                lista = new Hajautusapu[i];
                for (int j = 0; j < lista2.length; j++) {
                    if (lista2[j] != null) {
                        insert(lista2[j].solmu, lista2[j].pituus); 
                    }
                } return;
            }
            i++;
    }
    }
/*
 * Tarkistaa, että onko annettu luku alkuluku.
 */
    private boolean isPrime(int i) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    
    /**
     * Poistaa solmun taulukosta eli muuttaa isEmptyn trueksi.
     * @param solmu
     * @return true jos solmu löytyi ja poistettiin, muuten false.
     */
    public boolean delete(Solmu solmu){
            int summa = solmu.hashCode();
            int i = 0;
        while (true) {
        int sijoitus = (i + summa) % lista.length;
            if (lista[sijoitus].solmu == solmu && lista[sijoitus].isEmpty == false) {
                lista[sijoitus].changeisEmpty();
                return true;
            }
        i++;
        if (lista[sijoitus] == null || i == lista.length) {
            return false;
        }
        } 
    }
    /**
     * Palauttaa solmun pituusarvon.
     * @param solmu
     * @return
     */
    public int getPituus(Solmu solmu) {
        int summa = solmu.hashCode();
        int i = 0;
        while (true) {
        int sijoitus = (i + summa) % lista.length;
        if (lista[sijoitus] == null || i == lista.length) {
            return Integer.MAX_VALUE;
        }
        if (lista[sijoitus].solmu == solmu && lista[sijoitus].isEmpty == false) {
            return lista[sijoitus].pituus;
        } i++;
        
        }
}
    /**
     * Tarkistaa, että onko pyydetyllä solmulla pituutta. Palauttaa true, jos
     * solmu löytyy. Muuten false.
     * 
     * @param solmu
     * @return
     */
    public boolean contains(Solmu solmu) {
        int luku = getPituus(solmu);
        if (luku == Integer.MAX_VALUE) {
            return false;
        } else {
            return true;
        }
    }
}