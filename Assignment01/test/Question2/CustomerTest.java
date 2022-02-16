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
public class CustomerTest {
    
    public CustomerTest() {
    }
  
    /**
     * Test of isMember method, of class Customer.
     */
    @Test
    public void testIsMember() {
        System.out.println("isMember");
        Customer instance = new Customer("Test");
        instance.setMember(true);
        boolean expResult = true;
        boolean result = instance.isMember();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMember method, of class Customer.
     */
    @Test
    public void testIsMember1() {
        System.out.println("isMember");
        Customer instance = new Customer("Test2");
        boolean expResult = false;
        boolean result = instance.isMember();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMember method, of class Customer.
     */
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        boolean expResult = true; 
        boolean member = true;
        Customer instance = new Customer("test");
        instance.setMember(member);
        Boolean result = instance.isMember();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer("name");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "testname";
        Customer instance = new Customer("test");
        instance.setName(name);
        assertEquals(instance.getName(), name);
       
    }

    /**
     * Test of getMemberType method, of class Customer.
     */
    @Test
    public void testGetMemberType() {
        System.out.println("getMemberType");
        Customer instance = new Customer("test");
        instance.setMemberType("gold");
        String expResult = "gold";
        String result = instance.getMemberType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemberType method, of class Customer.
     */
    @Test
    public void testSetMemberType() {
        System.out.println("setMemberType");
        String memberType = "gold";
        Customer instance = new Customer("test");
        instance.setMemberType(memberType);
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer n = new Customer("test");
        n.setMember(true);
        n.setMemberType("gold");
        String expResult = "Customer{name=test, member=true, memberType=gold}";
        String result = n.toString();
        assertEquals(expResult, result);
    }
    
}
