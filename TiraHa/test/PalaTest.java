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
public class PalaTest {
    
    public PalaTest() {
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
     * Test of onkoSama method, of class Pala.
     */
    @Test
    public void testOnkoSama() {
        System.out.println("onkoSama");
        Pala toinenpala = null;
        Pala instance = null;
        boolean expResult = false;
        boolean result = instance.onkoSama(toinenpala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaasolmu method, of class Pala.
     */
    @Test
    public void testLisaasolmu() {
        System.out.println("lisaasolmu");
        Solmu solmu = null;
        Pala instance = null;
        instance.lisaasolmu(solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaakaari method, of class Pala.
     */
    @Test
    public void testLisaakaari() {
        System.out.println("lisaakaari");
        Kaari kaari = null;
        Pala instance = null;
        instance.lisaakaari(kaari);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yhdista method, of class Pala.
     */
    @Test
    public void testYhdista() {
        System.out.println("yhdista");
        Pala toinenpala = null;
        Palahajautustaulu taulu = null;
        Pala instance = null;
        instance.yhdista(toinenpala, taulu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Pala.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Solmu solmu = null;
        Pala instance = null;
        boolean expResult = false;
        boolean result = instance.contains(solmu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
