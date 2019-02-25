package edu.csp.UnitTestAssignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author swain
 */
public class StackTest {
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        Stack instance = new Stack();
        Object item = instance.array.get(0);
        Object result = instance.pop();
        assertEquals(item, result);
        fail("Test failed for pop()");
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        Stack instance = new Stack();
        Object item = new Object();
        Object result = instance.push(item);
        assertEquals(item, result);
        fail("Test failed for push()");
    }
     
    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        Stack instance = new Stack();
        Object item = instance.array.get(0);
        Object result = instance.peek();
        assertEquals(item, result);
        fail("Test failed for peek()");
    }

    /**
     * Test of empty method, of class Stack.
     */
    @Test
    public void testEmpty() {
        // first test case
        Stack instance1 = new Stack();
        boolean result1 = instance1.empty();
        
        // second test case
        Stack instance2 = new Stack();
        Object item = new Object();
        for (int i = 0; i < instance2.array.size(); i++) {
            instance2.push(item);
        }
        boolean result2 = instance2.empty();
        
        assertEquals(true, result1);
        assertEquals(false, result2);
        fail("Test failed for empty().");
    }
    
    
    @Test (expected = FullStackException.class)
    public void testFullStack() {
        // This method tests attempting to add an item to an ArrayList that
        // is already full.
        //
        // Creating full ArrayList
        Stack instance = new Stack();
        Object item = new Object();
        for (int i = 0; i < instance.array.size(); i++) {
            instance.push(item);
        }
        // Attempting to add another item to the ArrayList
        instance.push(item);
    }
    
    @Test (expected = EmptyStackException.class)
    public void testEmptyStack() {
        // This method tests attempting to remove an item from an ArrayList
        // when the ArrayList is already empty.
        Stack instance = new Stack();
        if (instance.empty())
            instance.pop();
    }
}
