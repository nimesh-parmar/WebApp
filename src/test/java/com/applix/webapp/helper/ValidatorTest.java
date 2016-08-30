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
    public void testBelowRangeIsThisANumber() {
        String paramValue = Long.toString((Long.MIN_VALUE - 1));
        long expResult = -1L;
        long result = Validator.isThisANumber(paramValue);
        assertEquals("Expected = -1, actual = " + result, expResult, result);
    }

    @Test
    public void testWithinRangeIsThisANumber() {
        String paramValue = Long.toString(2000L);
        long expResult = 2000L;
        long result = Validator.isThisANumber(paramValue);
        assertEquals("Expected = 2000, actual = " + result, expResult, result);
    }

//    @Test
//    public void testBorderMinusOneIsThisANumber() {
//        String paramValue = Long.toString(-1L);
//        long expResult = -1L;
//        long result = Validator.isThisANumber(paramValue);
//        assertEquals("Expected = -1, actual = " + result, expResult, result);
//    }

    @Test
    public void testBorderZeroIsThisANumber() {
        String paramValue = Long.toString(0L);
        long expResult = 0L;
        long result = Validator.isThisANumber(paramValue);
        assertEquals("Expected = 0, actual = " + result, expResult, result);
    }

//    @Test
//    public void testBorderPlusOneIsThisANumber() {
//        String paramValue = Long.toString(1L);
//        long expResult = 1L;
//        long result = Validator.isThisANumber(paramValue);
//        assertEquals("Expected = 1, actual = " + result, expResult, result);
//    }

//    @Test
//    public void testAboveRangeIsThisANumber() {
//        String paramValue = Long.toString((Long.MAX_VALUE + 1));
//        long expResult = -1L;
//        long result = Validator.isThisANumber(paramValue);
//        assertEquals("Expected = -1, actual = " + result, expResult, result);
//    }

    @Test
    public void testPlusIsThisAValidOperator() {
        String paramOperator = "+";
        boolean expResult = true;
        boolean result = Validator.isThisAValidOperator(paramOperator);
        assertEquals("Expected = true, actual = " + result, expResult, result);
        assertEquals("", expResult, result);
    }
    
}
