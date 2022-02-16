// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danich Hang
 */
public class DiscountRateTest {
    
    public DiscountRateTest() {
    }
    
    /**
     * Test of getServiceDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetServiceDiscountRate() {
        System.out.println("getServiceDiscountRate");
        String type = "gold";
        double expResult = 0.15;
        double result = DiscountRate.getServiceDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getProductDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetProductDiscountRate() {
        System.out.println("getProductDiscountRate");
        String type = "gold";
        double expResult = 0.1;
        double result = DiscountRate.getProductDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
}
