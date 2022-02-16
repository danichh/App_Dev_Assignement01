// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;


import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danich Hang
 */
public class VisitTest {
    
    public VisitTest() {
    }
    
    /**
     * Test of getName method, of class Visit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Visit instance = new Visit("test", new Date());
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getServiceExpense method, of class Visit.
     */
    @Test
    public void testGetServiceExpense() {
        System.out.println("getServiceExpense");
        Visit instance = new Visit("test", new Date());
        instance.setServiceExpense(2.99);
        double expResult = 2.99;
        double result = instance.getServiceExpense();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setServiceExpense method, of class Visit.
     */
    @Test
    public void testSetServiceExpense() {
        System.out.println("setServiceExpense");
        double serviceExpense = 2.00;
        Visit instance = new Visit("test", new Date());
        instance.setServiceExpense(serviceExpense);
    }

    /**
     * Test of getProductExpense method, of class Visit.
     */
    @Test
    public void testGetProductExpense() {
        System.out.println("getProductExpense");
        Visit instance = new Visit("test", new Date());
        instance.setProductExpense(9.99);
        double expResult = 9.99;
        double result = instance.getProductExpense();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setProductExpense method, of class Visit.
     */
    @Test
    public void testSetProductExpense() {
        System.out.println("setProductExpense");
        double productExpense = 9.99;
        Visit instance = new Visit("test", new Date());
        instance.setProductExpense(productExpense);
    }

    /**
     * Test of getTotalExpense method, of class Visit.
     */
    @Test
    public void testGetTotalExpense() {
        System.out.println("getTotalExpense");
        Visit instance = new Visit("test", new Date());
        instance.setProductExpense(9.99);
        instance.setServiceExpense(9.99);
        double expResult = 19.98;
        double result = instance.getTotalExpense();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Visit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Visit instance = new Visit("danich", new Date());
        String expResult = "Visit{customer=Customer{name=danich, member=false, memberType=null}, date=Sat Feb 12 23:00:08 EST 2022, serviceExpense=0.0, productExpense=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
