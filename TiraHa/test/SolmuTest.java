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
public class SolmuTest {
    
    public SolmuTest() {
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
     * Test of lisaavierus method, of class Solmu.
     */
    @Test
    public void testLisaavierus() {
        System.out.println("lisaavierus");
        int etaisyys = 0;
        Solmu solmu = null;
        Solmu instance = null;
        instance.lisaavierus(etaisyys, solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaprim method, of class Solmu.
     */
    @Test
    public void testLisaaprim() {
        System.out.println("lisaaprim");
        int etaisyys = 0;
        Solmu solmu = null;
        Solmu instance = null;
        instance.lisaaprim(etaisyys, solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostanimi method, of class Solmu.
     */
    @Test
    public void testTulostanimi() {
        System.out.println("tulostanimi");
        Solmu instance = null;
        String expResult = "";
        String result = instance.tulostanimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nollaaParent method, of class Solmu.
     */
    @Test
    public void testNollaaParent() {
        System.out.println("nollaaParent");
        Solmu instance = null;
        instance.nollaaParent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muutaParent method, of class Solmu.
     */
    @Test
    public void testMuutaParent() {
        System.out.println("muutaParent");
        Solmu solmu = null;
        Solmu instance = null;
        instance.muutaParent(solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParent method, of class Solmu.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        Solmu instance = null;
        Solmu expResult = null;
        Solmu result = instance.getParent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Solmu.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = null;
        Solmu instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nollaaPrimlista method, of class Solmu.
     */
    @Test
    public void testNollaaPrimlista() {
        System.out.println("nollaaPrimlista");
        Solmu instance = null;
        instance.nollaaPrimlista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
