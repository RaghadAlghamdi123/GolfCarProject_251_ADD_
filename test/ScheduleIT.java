/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Time;
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
public class ScheduleIT {
    
    public ScheduleIT() {
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
     * Test of getStart_time method, of class Schedule.
     */
    @Test
    public void testGetStart_time() {
        System.out.println("getStart_time");
        Schedule instance = null;
        Time expResult = null;
        Time result = instance.getStart_time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_time method, of class Schedule.
     */
    @Test
    public void testSetStart_time() {
        System.out.println("setStart_time");
        Time start_time = null;
        Schedule instance = null;
        instance.setStart_time(start_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd_time method, of class Schedule.
     */
    @Test
    public void testGetEnd_time() {
        System.out.println("getEnd_time");
        Schedule instance = null;
        Time expResult = null;
        Time result = instance.getEnd_time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd_time method, of class Schedule.
     */
    @Test
    public void testSetEnd_time() {
        System.out.println("setEnd_time");
        Time end_time = null;
        Schedule instance = null;
        instance.setEnd_time(end_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
