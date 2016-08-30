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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of calculate method, of class Calculator.
     */
    @Test
    public void testAddCalculate() {
        Long paramValue1 = new Long("10");
        String paramOperator = "+";
        Long paramValue2 = new Long("20");
        Long expResult = 30L;
        Long result = Calculator.calculate(paramValue1, paramOperator, paramValue2);
        assertEquals("expected result = 30, actual result = " + result, expResult, result);
    }
    
    @Test
    public void testSubtractCalculate() {
        Long paramValue1 = new Long("10");
        String paramOperator = "-";
        Long paramValue2 = new Long("20");
        Long expResult = -10L;
        Long result = Calculator.calculate(paramValue1, paramOperator, paramValue2);
        assertEquals("expected result = -10, actual result = " + result, expResult, result);
    }
    
    @Test
    public void testMultiplyCalculate() {
        Long paramValue1 = new Long("10");
        String paramOperator = "*";
        Long paramValue2 = new Long("20");
        Long expResult = 200L;
        Long result = Calculator.calculate(paramValue1, paramOperator, paramValue2);
        assertEquals("expected result = 200, actual result = " + result, expResult, result);
    }
    
    @Test
    public void testDivideCalculate() {
        Long paramValue1 = new Long("100");
        String paramOperator = "/";
        Long paramValue2 = new Long("20");
        Long expResult = 5L;
        Long result = Calculator.calculate(paramValue1, paramOperator, paramValue2);
        assertEquals("expected result = 5, actual result = " + result, expResult, result);
    }
    
    @Test
    public void testIllegalOperatorCalculate() {
        Long paramValue1 = new Long("100");
        String paramOperator = "$";
        Long paramValue2 = new Long("20");
        Long expResult = 0L;
        Long result = Calculator.calculate(paramValue1, paramOperator, paramValue2);
        assertEquals("expected result = 0, actual result = " + result, expResult, result);
    }
    
}
