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
    
  public HashMap <Solmu, Integer> vieruslista;
  private String nimi;
  
  public Solmu(String nimi) {
      vieruslista = new HashMap<>();
      this.nimi = nimi;
  }
    
    public void lisaavierus(int etaisyys, Solmu solmu) {
        vieruslista.put(solmu, etaisyys);
    }

    public String tulostanimi() {
        return nimi;
    }
    
}
