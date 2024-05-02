/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saral
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of getCurrentLocation method, of class Order.
     */
    @Test
    public void testGetCurrentLocation() {
        System.out.println("getCurrentLocation");
        Order instance = null;
        Location expResult = null;
        Location result = instance.getCurrentLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentLocation method, of class Order.
     */
    @Test
    public void testSetCurrentLocation() {
        System.out.println("setCurrentLocation");
        Location currentLocation = null;
        Order instance = null;
        instance.setCurrentLocation(currentLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestinationLocation method, of class Order.
     */
    @Test
    public void testGetDestinationLocation() {
        System.out.println("getDestinationLocation");
        Order instance = null;
        Location expResult = null;
        Location result = instance.getDestinationLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestinationLocation method, of class Order.
     */
    @Test
    public void testSetDestinationLocation() {
        System.out.println("setDestinationLocation");
        Location destinationLocation = null;
        Order instance = null;
        instance.setDestinationLocation(destinationLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Order.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Order instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Order.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Order instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumSeats method, of class Order.
     */
    @Test
    public void testGetNumSeats() {
        System.out.println("getNumSeats");
        Order instance = null;
        int expResult = 0;
        int result = instance.getNumSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSeats method, of class Order.
     */
    @Test
    public void testSetNumSeats() {
        System.out.println("setNumSeats");
        int numSeats = 0;
        Order instance = null;
        instance.setNumSeats(numSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancellationOrder method, of class Order.
     */
    @Test
    public void testCancellationOrder() {
        System.out.println("cancellationOrder");
        Boolean isCancel = null;
        Order instance = null;
        instance.cancellationOrder(isCancel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scheduleOrder method, of class Order.
     */
    @Test
    public void testScheduleOrder() {
        System.out.println("scheduleOrder");
        Order order = null;
        Order.scheduleOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
