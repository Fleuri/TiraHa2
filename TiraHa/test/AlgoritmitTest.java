/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class AlgoritmitTest {
    Solmu[] verkko;
    public AlgoritmitTest() {
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
 
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
                   Solmu A = new Solmu("A"); Solmu B
          = new Solmu("B"); Solmu C = new Solmu("C"); Solmu D = new Solmu("D");
          A.lisaavierus(1, B); A.lisaavierus(6, D); B.lisaavierus(1, A);
          B.lisaavierus(5, C); B.lisaavierus(6, D); C.lisaavierus(5, B);
          C.lisaavierus(5, D); D.lisaavierus(6, B); D.lisaavierus(5, C);
          D.lisaavierus(6, A); 
          verkko = new Solmu[]{A,B,C,D};
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tulostavierusmatriisi method, of class Algoritmit.
     */
    
    public void testTulostavierusmatriisi() {
        System.out.println("tulostavierusmatriisi");
        Solmu[] verkko = null;
        Algoritmit instance = new Algoritmit();
        instance.tulostavierusmatriisi(verkko);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of primAlgoritmi method, of class Algoritmit.
     */
    
    public void testPrimAlgoritmi() {
        System.out.println("primAlgoritmi");
        
        Algoritmit instance = new Algoritmit();
        Solmu A = new Solmu("A"); Solmu B
          = new Solmu("B"); Solmu C = new Solmu("C"); Solmu D = new Solmu("D");
          A.lisaavierus(1, B); A.lisaavierus(6, D); B.lisaavierus(1, A);
          B.lisaavierus(5, C); B.lisaavierus(6, D); C.lisaavierus(5, B);
          C.lisaavierus(5, D); D.lisaavierus(6, B); D.lisaavierus(5, C);
          D.lisaavierus(6, A); 
          Solmu [] verkko2 = new Solmu[]{A,B,C,D};
          A.lisaaprim(1, B);
          B.lisaaprim(5, C);
          C.lisaaprim(5, D);
          B.lisaaprim(1, A);
          C.lisaaprim(5, B);
          D.lisaaprim(5, C);
        Solmu[] expResult = verkko2 ;
        Solmu[] result = instance.primAlgoritmi(verkko);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of tulostaprim method, of class Algoritmit.
     */
    
    public void testTulostaprim() {
        System.out.println("tulostaprim");
        Solmu[] verkko = null;
        Algoritmit instance = new Algoritmit();
        instance.tulostaprim(verkko);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKaaret method, of class Algoritmit.
     */
    
    public void testGetKaaret() {
        System.out.println("getKaaret");
        Solmu[] verkko = null;
        Algoritmit instance = new Algoritmit();
        Kaari[] expResult = null;
        Kaari[] result = instance.getKaaret(verkko);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Kruskal method, of class Algoritmit.
     */
   
    public void testKruskal() {
        System.out.println("Kruskal");
        Solmu[] verkko = null;
        Algoritmit instance = new Algoritmit();
        instance.Kruskal(verkko);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
