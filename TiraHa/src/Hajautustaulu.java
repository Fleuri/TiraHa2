/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Hajautustaulu {
    Hajautusapu[] lista;
    
    public Hajautustaulu(){
        lista = new Hajautusapu[11];
        }
    public boolean insert(Solmu solmu, int pituus){
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

    private void pidennalista() {
        while (true) {
        int i = lista.length;
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

    private boolean isPrime(int i) {
        while (true) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    return true;
                }
            }
        }
    }
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
}
