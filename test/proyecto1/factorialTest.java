/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 311B
 */
public class factorialTest {
    
    public factorialTest() {
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
     * Test of factorial method, of class factorial.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 0;
        int expResult = 0;
        int result = factorial.factorial(numero);
        assertEquals(expResult, result);
      
    }
    
}
