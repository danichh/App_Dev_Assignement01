// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danich Hang
 */
public class Driver {
    static ArrayList<Customer> customerLists = new ArrayList<Customer>(); 
    static String memberShipType [] = {"Preminum", "Gold", "Silver"};
    
    public static void main(String[] args) { 
        Scanner console = new Scanner(System.in);
        Random rand = new Random(); 

        //create and insert custumer in a ArrayList
        customerLists.add(new Customer("c1"));
        customerLists.add(new Customer("c2"));
        customerLists.add(new Customer("c3"));

        
        // set the memberShip state of custumer 
        customerLists.get(0).setMember(true);
        customerLists.get(2).setMember(true);
        
        // set memberShhip type 
        customerLists.get(0).setMemberType(memberShipType[rand.nextInt(3)]);
        customerLists.get(2).setMemberType(memberShipType[rand.nextInt(3)]);
        
        // start of the app
        String name = "";   
        Visit visit = null;
        
       
        System.out.println("Welcome to the Beauty Salon");
        System.out.println("Please entre your name: ");
        name = console.nextLine();
        
        for (Customer c : customerLists){
            if(c.getName().equalsIgnoreCase(name)){
                visit = new Visit(c, new Date());
                break;
            }    
        }
        if (visit == null)
            visit = new Visit(name, new Date());
          
        System.out.println("Please enter the amount spend on Service: ");
        visit.setServiceExpense(console.nextDouble());
        System.out.println("Please enter the amount spend on  Product: ");
        visit.setProductExpense(console.nextDouble());
        System.out.println("Your total : " + visit.getTotalExpense());
        
    }
}

