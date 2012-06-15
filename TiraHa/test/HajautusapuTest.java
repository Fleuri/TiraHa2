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
public class HajautusapuTest {
    
    public HajautusapuTest() {
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
     * Test of isEmpty method, of class Hajautusapu.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Hajautusapu instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeisEmpty method, of class Hajautusapu.
     */
    @Test
    public void testChangeisEmpty() {
        System.out.println("changeisEmpty");
        Hajautusapu instance = null;
        instance.changeisEmpty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
