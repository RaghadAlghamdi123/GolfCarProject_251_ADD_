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
public class StudentTest {
    
    public StudentTest() {
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
    /*
        @Test
    public void testCancelOrder() {
        System.out.println("cancelOrder");
        Student instance = null;
        instance.cancelOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */


    /**
     * Test of requestGolfCar method, of class Student.
     */

    
 @Test
public void testRequestGolfCar1() {
    System.out.println("requestGolfCar");
    Location currentLocation = new Location("buliding 460");
    Location destinationLocation = new Location("buliding 65");
    int numSeats = 4; // or any number of seats you want to test with
    Student instance = new Student(11223344,"Rania");
    Order expResult = new Order(currentLocation, destinationLocation, numSeats);
    Order result = instance.requestGolfCar(currentLocation, destinationLocation, numSeats);
    assertNotNull(result);
}
    


    
}
