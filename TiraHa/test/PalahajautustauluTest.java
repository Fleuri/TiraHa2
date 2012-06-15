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
public class PalahajautustauluTest {
    
    public PalahajautustauluTest() {
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
     * Test of insert method, of class Palahajautustaulu.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pala pala = null;
        Palahajautustaulu instance = new Palahajautustaulu();
        boolean expResult = false;
        boolean result = instance.insert(pala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Palahajautustaulu.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Pala pala = null;
        Palahajautustaulu instance = new Palahajautustaulu();
        boolean expResult = false;
        boolean result = instance.delete(pala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPala method, of class Palahajautustaulu.
     */
    @Test
    public void testGetPala() {
        System.out.println("getPala");
        Pala pala = null;
        Palahajautustaulu instance = new Palahajautustaulu();
        Pala expResult = null;
        Pala result = instance.getPala(pala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
