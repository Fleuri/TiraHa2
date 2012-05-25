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
public class PrimTest {
    
    public PrimTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tulostavierusmatriisi method, of class Prim.
     */
    @Test
    public void testTulostavierusmatriisi() {
        System.out.println("tulostavierusmatriisi");
        Solmu[] verkko = null;
        Prim instance = new Prim();
        instance.tulostavierusmatriisi(verkko);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of primAlgoritmi method, of class Prim.
     */
    @Test
    public void testPrimAlgoritmi() {
        System.out.println("primAlgoritmi");
        Solmu[] verkko = null;
        Prim instance = new Prim();
        Solmu[] expResult = null;
        Solmu[] result = instance.primAlgoritmi(verkko);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaprim method, of class Prim.
     */
    @Test
    public void testTulostaprim() {
        System.out.println("tulostaprim");
        Solmu[] verkko = null;
        Prim instance = new Prim();
        instance.tulostaprim(verkko);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
