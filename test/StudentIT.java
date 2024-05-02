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
public class StudentIT {
    
    public StudentIT() {
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
     * Test of cancelOrder method, of class Student.
     */
    @Test
    public void testCancelOrder() {
        System.out.println("cancelOrder");
        Student instance = null;
        instance.cancelOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestGolfCar method, of class Student.
     */
    @Test
    public void testRequestGolfCar() {
        System.out.println("requestGolfCar");
        Location currentLocation = null;
        Location destinationLocation = null;
        int numSeats = 0;
        Student instance = null;
        Order expResult = null;
        Order result = instance.requestGolfCar(currentLocation, destinationLocation, numSeats);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
