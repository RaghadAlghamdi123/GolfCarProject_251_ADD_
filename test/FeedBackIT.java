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
public class FeedBackIT {
    
    public FeedBackIT() {
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
     * Test of getFeedback_Id method, of class FeedBack.
     */
    @Test
    public void testGetFeedback_Id() {
        System.out.println("getFeedback_Id");
        FeedBack instance = null;
        int expResult = 0;
        int result = instance.getFeedback_Id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFeedback_Id method, of class FeedBack.
     */
    @Test
    public void testSetFeedback_Id() {
        System.out.println("setFeedback_Id");
        int feedback_Id = 0;
        FeedBack instance = null;
        instance.setFeedback_Id(feedback_Id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFeedback method, of class FeedBack.
     */
    @Test
    public void testGetFeedback() {
        System.out.println("getFeedback");
        FeedBack instance = null;
        String expResult = "";
        String result = instance.getFeedback();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFeedback method, of class FeedBack.
     */
    @Test
    public void testSetFeedback() {
        System.out.println("setFeedback");
        String feedback = "";
        FeedBack instance = null;
        instance.setFeedback(feedback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class FeedBack.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        FeedBack instance = null;
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class FeedBack.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int rating = 0;
        FeedBack instance = null;
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
