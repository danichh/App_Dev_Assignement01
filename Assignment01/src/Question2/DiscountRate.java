// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;

/**
 * Discount Rate 
 * store all the discount Rate 
 * and return the  discount Rate  accordingly  
 * @author Danich Hang
 */
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    
    /**
     * return the correct discount Rate of Service 
     * @param type is the given type of memberships 
     * @return the respective discount rate
     */
    public static double getServiceDiscountRate(String type){
        switch(type.toLowerCase()){
            case "preminum":
                return serviceDiscountPremium;
            case "gold":
                return  serviceDiscountGold;
            case "silver":
                return  serviceDiscountSilver;
            default:
                return 0; 
        }
    }
    
    /**
     * return the correct discount Rate of product 
     * @param type is the given type of memberships 
     * @return the respective discount rate
     */
    public static double getProductDiscountRate(String type){
        
        
        switch(type.toLowerCase()){
            case "preminum":
                return productDiscountPremium;
            case "gold":
                return  productDiscountGold;
            case "silver":
                return  productDiscountSilver;
            default:
                return 0; 
        }
    }
    
    
}
