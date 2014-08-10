/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian-pc
 */
public class SerieTest {
    
    public SerieTest() {
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
     * Test of SumarR method, of class Serie.
     */
    @Test
    public void testSumarR() {
        System.out.println("SumarR");
        double rt1 = 100.0;
        double rt2 = 220.0;
        double rt3 = 30.0;
        double vt = 10.0;
        Serie instance = new Serie();
        Double expResult = 0.02857142857142857;
        Double result = instance.SumarR(rt1, rt2, rt3, vt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
