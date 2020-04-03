// Importing all java classes
import java.util.*;
// This program validates if a email is true or not
public class VerifiedEmail{
    public static void main(String[] args) {
        // Using the scanner class and calling it kb (keyboard)
        Scanner kb = new Scanner(System.in);
        // Initializing an int i for itteration
        int i = 0;

        // Output the question to the user
        System.out.println("To validate your email adress, please enter it:");
        // Getting input from the user
        String email = kb.nextLine();

        // Using the length method to find the length of the email inputed
        int length = email.length();
        // Finding the index of the at sign
        int addressSign = email.indexOf('@');

        // By using a for loop, we are looking for the position of the address sign
        for (i = 0; i < addressSign; i++){} 
        
        // Creating a string called addressToEnd that is the value of the email inputed by the user
        //from the point where is the addres sign to the end of the length (the end of the string)
        String addressToEnd = email.substring(i, length);

        // If from the point where the address sign to the end is equal to @vaniercollege.qc.ca OR vanier.college, it is a valid email
        if (addressToEnd.equals("@vaniercollege.qc.ca") || addressToEnd.equals("@vanier.college")) 
        {
            // Output to the user that the email inputed is a valid email
            System.out.println(email + " is a valid email");
        }
        
        // Else, it is not valid email
        else
        {
            // Output to the user that the email inputed is not valid email
            System.out.println(email + " is not a valid email");
        }
    }
}