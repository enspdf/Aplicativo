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
public class PitagorasTest {
    
    public PitagorasTest() {
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
     * Test of hipotenusa method, of class Pitagoras.
     */
    @Test
    public void testHipotenusa() {
        System.out.println("hipotenusa");
        double catetoa = 5.0;
        double catetob = 2.0;
        Pitagoras instance = new Pitagoras();
        double expResult = 5.385164807134504;
        double result = instance.hipotenusa(catetoa, catetob);
        assertEquals(expResult, result, 5.385164807134504);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of catetoa method, of class Pitagoras.
     */
    @Test
    public void testCatetoa() {
        System.out.println("catetoa");
        double catetob = 3.0;
        double hipotenusa = 5.0;
        Pitagoras instance = new Pitagoras();
        double expResult = 4.0;
        double result = instance.catetoa(catetob, hipotenusa);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of catetob method, of class Pitagoras.
     */
    @Test
    public void testCatetob() {
        System.out.println("catetob");
        double catetoa = 4.0;
        double hipotenusa = 5.0;
        Pitagoras instance = new Pitagoras();
        double expResult = 3.0;
        double result = instance.catetob(catetoa, hipotenusa);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
