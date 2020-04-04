import java.util.*;

// This program prompts the user for the user and then outputs if the email inputed by the user is valid or not
public class ValidateEmail{
    public static void main(String[] args) {
        // Creating two booleans, one for saying if the address sign has been found 
        // and another for saying if a dot has been found and giving false as a initial value
        boolean foundDot = false;
        boolean foundAddressSign = false;

        // Using the scanner class to recieve input from the user
        Scanner kb = new Scanner(System.in);

        // Prompt the user for an email address
        System.out.println("Enter an email address");
        // Recieving input from the user
        String email = kb.next();

        // Creating a for loop to go over each character by using the integer i for itteration
        for (int i = 0; i < email.length(); i++){
            // If the value of foundAddressSign is still false and (nested if)...
            if (!foundAddressSign) {
                // if the current letter of the itteration is equal to an address sign, the foundAddressSign is now true
                if (email.charAt(i) == '@') {
                    foundAddressSign = true;
                }
            }
            // Or If the value of foundDot is still false and (nested if)..
            else if (!foundDot) {
                if (email.charAt(i) == '.') {
                    // if the current letter of the itteration is equal to a dot, the founddot is now true
                    foundDot = true;
                }
            }
        }
        // If by looping to each character the email inputed by the user and the program finds a dot and an address sign then the email is valid
        if (foundAddressSign && foundDot){
            // Output
            System.out.println(email + " is a valid email");
        }
        // Else, one or both conditions to be a valid email are not met, then the email is invalid
        else{
            // Output
            System.out.println(email + " is an invalid email");
        }

        
    }
}