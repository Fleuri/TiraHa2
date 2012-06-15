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
public class HeapTest {
    
    public HeapTest() {
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
     * Test of insert method, of class Heap.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Solmu solmu = null;
        Heap instance = null;
        instance.insert(solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poll method, of class Heap.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        Heap instance = null;
        Solmu expResult = null;
        Solmu result = instance.poll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Heap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Heap instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Heap.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Solmu solmu = null;
        Heap instance = null;
        boolean expResult = false;
        boolean result = instance.contains(solmu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Heap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Solmu solmu = null;
        Heap instance = null;
        instance.remove(solmu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
