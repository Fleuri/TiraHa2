/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
public class Palahajautustaulu {
    Pala[] lista;
    
    /**
     * 
     */
    public Palahajautustaulu(){
        lista = new Pala[11];
        }
    /**
     * 
     * @param pala
     * @return
     */
    public boolean insert(Pala pala){
        int i = 0;
        int summa = pala.hashCode();
        while (true) {
        int sijoitus = (i + summa) % lista.length;
            if (lista[sijoitus] == null || lista[sijoitus].isEmpty == true) {
                lista[sijoitus] = pala;
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
                Pala[] lista2 = lista;
                lista = new Pala[i];
                for (int j = 0; j < lista2.length; j++) {
                    if (lista2[j] != null) {
                        insert(lista2[j]); 
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
    /**
     * 
     * @param pala
     * @return
     */
    public boolean delete(Pala pala){
            int summa = pala.hashCode();
            int i = 0;
        while (true) {
        int sijoitus = (i + summa) % lista.length;
            if (lista[sijoitus]== pala && lista[sijoitus].isEmpty == false) {
                lista[sijoitus].isEmpty = true;
                return true;
            }
        i++;
        if (lista[sijoitus] == null || i == lista.length) {
            return false;
        }
        } 
    }
    /**
     * 
     * @param pala
     * @return
     */
    public Pala getPala(Pala pala) {
        int summa = pala.hashCode();
        int i = 0;
        while (true) {
        int sijoitus = (i + summa) % lista.length;
        if (lista[sijoitus] == pala && lista[sijoitus].isEmpty == false) {
            return lista[sijoitus];
        } i++;
        if (lista[sijoitus] == null || i == lista.length) {
            return null;
        }
        }
}

}