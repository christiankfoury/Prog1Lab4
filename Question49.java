/** 
 * @author Christian Kfoury
 * This program asks the user how many times does he/she want hello world to be printed and outputs the desired amount of times the user wants
*/
import java.util.*;
public class HelloWorld{
    public static void main(String[] args) {
        // Using an integer called times that will be used later to loop the desire amount of times inputed by the user
        int times = 0;
        // Using the scanner class
        Scanner kb = new Scanner(System.in);
        // Prompt the user
        System.out.println("How many time do you want to output \"Hello World\"?");
        // Verfying if the input is a integer
        if (kb.hasNextInt())
        {
            // if is, then recieve and store the input in the integer times
            times = kb.nextInt();   
        } 
        // Creating a for loop to loop the desired amount of times the user wants "Hello World" to be printed
        for (int i = 0; i < times; i++){
            // Output "Hello World"
            System.out.println("Hello World");
        }
    }
}