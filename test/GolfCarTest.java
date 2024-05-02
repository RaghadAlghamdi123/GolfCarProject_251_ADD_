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
public class GolfCarTest {
    
    public GolfCarTest() {
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
     * Test of getNumSeats method, of class GolfCar.
     */
    @Test
    public void testGetNumSeats() {
        System.out.println("getNumSeats");
        GolfCar instance = null;
        int expResult = 0;
        int result = instance.getNumSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSeats method, of class GolfCar.
     */
    @Test
    public void testSetNumSeats() {
        System.out.println("setNumSeats");
        int numSeats = 0;
        GolfCar instance = null;
        instance.setNumSeats(numSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlatenum method, of class GolfCar.
     */
    @Test
    public void testGetPlatenum() {
        System.out.println("getPlatenum");
        GolfCar instance = null;
        String expResult = "";
        String result = instance.getPlatenum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlatenum method, of class GolfCar.
     */
    @Test
    public void testSetPlatenum() {
        System.out.println("setPlatenum");
        String platenum = "";
        GolfCar instance = null;
        instance.setPlatenum(platenum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
