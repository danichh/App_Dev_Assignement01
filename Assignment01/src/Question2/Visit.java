// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;

import java.util.Date;

/**
 * Record for the customer visit 
 * which customer
 * when did they purchase the goods
 * what did they purchase 
 * @author Danich Hang
 */
public class Visit {
    private Customer customer; 
    private Date date; 
    private double serviceExpense; 
    private double productExpense;

    /**
     * Constructor 
     * @param name is the client name
     * @param date is the date of purchase
     */
    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }
    
    /**
     * Constructor 
     * @param name is the client name
     * @param date is the date of purchase
     */
    public Visit(Customer c, Date date) {
        this.customer = c;
        this.date = date;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }
    
    public String getName(){
        return customer.getName();
    }


    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    
    public double getTotalExpense(){
        String type = customer.getMemberType();
        productExpense -= DiscountRate.getProductDiscountRate(type) * productExpense; 
        serviceExpense -= DiscountRate.getServiceDiscountRate(type) * serviceExpense; 
        return productExpense + serviceExpense; 
    }

    @Override
    public String toString() {
        return "Visit{" + "customer=" + customer + ", date=" + date + 
                ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + '}';
    }
}
