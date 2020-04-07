/** 
 * @author Christian Kfoury
 * This program prompts ht user for a valueer greater than 10 and keep doing square rooting that number uuntil it is smaller than 1.01
 *  */ 
 
// Importing all Java classes
import java.util.*;

public class Question43{
    public static void main(String[] args) {
        // Using the scanner class
        Scanner kb = new Scanner(System.in);
        // Creating an integer called itteration that will be used later
        int itteration = 0;

        // Prompt the user for number greater than 10
        System.out.println("Enter a number greater than 10");
        // Getting input from the user
        double number = kb.nextDouble();

        // Creating a while loop if the number is not greater than 10 and reasking the question
        while (number <= 10) {
            // Output that the number is not greater than 10
            System.out.println(number + " is not a number greater than 10");
            // Prompt the user the question again
            System.out.println("Enter a number greater than 10");
            // Get input
            number = kb.nextDouble();
        }
        // Creating a while loop to perform the square root of the number inputed until it is smaller than 1.01
        while (number > 1.01){
            // The new assigned number to the number inputed by the user is now the square root of it
            number = Math.sqrt(number);
            // Add 1 to itteration
            itteration = itteration + 1;
        }
        // Output how many times the operation was performed until it became smaller than 1.01
        System.out.println("The operation was performed " + itteration + " times until it became smaller 1.01");
    }
} 