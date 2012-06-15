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
public class KelloTest {
    
    public KelloTest() {
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
     * Test of primStart method, of class Kello.
     */
    @Test
    public void testPrimStart() {
        System.out.println("primStart");
        Kello.primStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of primStop method, of class Kello.
     */
    @Test
    public void testPrimStop() {
        System.out.println("primStop");
        Kello.primStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kruskalStart method, of class Kello.
     */
    @Test
    public void testKruskalStart() {
        System.out.println("kruskalStart");
        Kello.kruskalStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kruskalStop method, of class Kello.
     */
    @Test
    public void testKruskalStop() {
        System.out.println("kruskalStop");
        Kello.kruskalStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaTiedot method, of class Kello.
     */
    @Test
    public void testTulostaTiedot() {
        System.out.println("tulostaTiedot");
        String expResult = "";
        String result = Kello.tulostaTiedot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
