/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

//import a Scanner to enable user input
import java.util.Scanner;

public class Car {
    private String carCode;
    private String carModel;
    
    //the getters
    public String getcarCode() {
        return carCode;
}
    
    public String getcarModel() {
        return carModel;
}
    
   //the setters
    public void setcarCode(String carCode) {
        this.carCode = carCode;
    }
    
     public void setcarModel(String carModel) {
        this.carModel = carModel;
    }
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car myCar = new Car();
        
        String carCode;
        String carModel;
        
         // get user input
        System.out.print("Enter the car code: ");
        carCode = input.nextLine();
        
        System.out.print("Enter the car model: ");
        carModel = input.nextLine();
        
        //set the carModel and carCode as the input gotten from the user.
        myCar.setcarCode(carCode);
        myCar.setcarModel(carModel);
        
        //print the carCode and carModel
        System.out.println("The car code is: " + carCode);
        System.out.println("The car model is: " + carModel);
        
    }
    
}
