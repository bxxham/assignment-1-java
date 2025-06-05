/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginsystem;

/**
 *
 * @author mwiri
 */

//import a Scanner to enable user input
import java.util.Scanner;
public class LoginSystem {
  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //set the correct username and correct password as constants
        final String correctUsername = "beckham";
        final String correctPassword = "beck678";
        
        int attempt = 0;
        boolean login = false;
        
        //loop to enable the user to make 3 tries
        while(attempt < 3) {
            //get user input
            System.out.print("Enter your user name: ");
            String username = input.nextLine();
            
            System.out.print("Enter your password: ");
            String password = input.nextLine();
            
            //print the password entered in asterics
            System.out.print("Password given: ");
            //loop the asteric to hide the password
            for(int i = 0; i < password.length(); i++) {
                System.out.print("*");
            }
            
            // check if the given username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\nLogged in successfully!");
                login = true;
                break;
                // break the loop when the correct username and password are entered
                
            } else {
                System.out.println("\nWrong input. Try again!");
                attempt++;
            }
        }
        //end of while loop
        
        // when all 3 tries fail restrict
             if (!login) {
                System.out.println("\nToo many attempts. Access denied!");
                    }
        }
    }


