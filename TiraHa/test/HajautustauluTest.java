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
public class HajautustauluTest {
    
    public HajautustauluTest() {
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
     * Test of insert method, of class Hajautustaulu.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Solmu solmu = null;
        int pituus = 0;
        Hajautustaulu instance = new Hajautustaulu();
        boolean expResult = false;
        boolean result = instance.insert(solmu, pituus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Hajautustaulu.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Solmu solmu = null;
        Hajautustaulu instance = new Hajautustaulu();
        boolean expResult = false;
        boolean result = instance.delete(solmu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPituus method, of class Hajautustaulu.
     */
    @Test
    public void testGetPituus() {
        System.out.println("getPituus");
        Solmu solmu = null;
        Hajautustaulu instance = new Hajautustaulu();
        int expResult = 0;
        int result = instance.getPituus(solmu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Hajautustaulu.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Solmu solmu = null;
        Hajautustaulu instance = new Hajautustaulu();
        boolean expResult = false;
        boolean result = instance.contains(solmu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
