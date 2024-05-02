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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getAdress method, of class Location.
     */
    @Test
    public void testGetAdress() {
        System.out.println("getAdress");
        Location instance = null;
        String expResult = "";
        String result = instance.getAdress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdress method, of class Location.
     */
    @Test
    public void testSetAdress() {
        System.out.println("setAdress");
        String adress = "";
        Location instance = null;
        instance.setAdress(adress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
