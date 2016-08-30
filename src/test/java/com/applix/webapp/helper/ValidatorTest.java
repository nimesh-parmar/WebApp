/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.applix.webapp.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class ValidatorTest {
    
    public ValidatorTest() {
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
     * Test of isThisANumber method, of class Validator.
     */
    @Test
    public void testIsThisANumber() {
        System.out.println("isThisANumber");
        String paramValue = "-1";
        long expResult = -1L;
        long result = Validator.isThisANumber(paramValue);
        System.out.println("result = " + result);
        assertEquals("Expected = -1, actual = " + result, expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isThisAValidOperator method, of class Validator.
     */
    @Test
    public void testIsThisAValidOperator() {
        System.out.println("isThisAValidOperator");
        String paramOperator = "B";
        boolean expResult = false;
        boolean result = Validator.isThisAValidOperator(paramOperator);
        assertEquals("Expected = false, actual = " + result, expResult, result);
        assertEquals("", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
