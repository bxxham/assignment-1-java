/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customer;

//import a Scanner to enable user input
import java.util.Scanner;

public class Customer {
    private String customerID;
    private String customerName;
    
    //the getters
    public String getcustomerID() {
        return customerID;
    }
    
    public String getcustomerName() {
    return customerName;
}
    
    //the setters
    public void setcustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          Customer client = new Customer();
          
        String customerID;
        String customerName;
        
         // get user input
        System.out.print("Enter the customer ID: ");
        customerID = input.nextLine();
        
        System.out.print("Enter the customer name: ");
        customerName = input.nextLine();
        
        //set customerID and customerName as the input received from the user
       client.setcustomerID(customerID);
       client.setcustomerName(customerName);
       
       // print the customerID and customerName
       System.out.println("Customer ID: " + client.getcustomerID());
       System.out.println("Customer name: " + client.getcustomerName());
       
    }
    
}
