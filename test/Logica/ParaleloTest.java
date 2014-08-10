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
public class ParaleloTest {
    
    public ParaleloTest() {
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
     * Test of CalculoPar method, of class Paralelo.
     */
    @Test
    public void testCalculoPar() {
        System.out.println("CalculoPar");
        double rt1 = 100.0;
        double rt2 = 220.0;
        double rt3 = 30.0;
        double vt = 10.0;
        Paralelo instance = new Paralelo();
        Double expResult = 0.4787878787878788;
        Double result = instance.CalculoPar(rt1, rt2, rt3, vt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
