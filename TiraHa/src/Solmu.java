/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauri Suomalainen
 */
import java.util.HashMap;
public class Solmu {
    
  public HashMap <Integer, Solmu> vieruslista;
    
    public void lisaavierus(int etaisyys, Solmu solmu) {
        vieruslista.put(etaisyys, solmu);
    }
    
}
