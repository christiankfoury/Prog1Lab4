import java.util.*;
public class GuessNumber{
    public static void main(String[] args) {
        // Declaring and iniatilizing a string called answer
        String answer = ""; 
        // Using the scanner class
        Scanner kb = new Scanner(System.in);
        // Using the random class
        Random random = new Random();
        // Creating a do while loop to perform the application again if the user responds yes if they want to play again if and only they have won
        do {
            // Generate a random integer between 0 and 100
            int randomNumber = random.nextInt(101);
            
            // Output the user to guess a number between 0 and 100
            System.out.println("Guess a number between 0 and 100. You have 10 tries to guess the number.");
            // Creating a integer called tries and setting it to 0
            int tries = 0;
            // Getting input for when the user guesses
            int guess = kb.nextInt();
            // Creating a while loop if the number of tries are less than 9 and it is not equal to the random number generated
            
            while(tries < 9 && guess != randomNumber)
            {
                // Output that the users guess is wrong
                System.out.println("Your guess is wrong!");
                // The number of tries is increased by 1
                tries +=1;
                // Ouput the user to guess again and let the user know how many tries he has left
                System.out.println("Guess another time! You have " + (10-tries) + " try(ies) left!");
                // Get input from the user
                guess = kb.nextInt();
            }
            
            // If by the end, the user never guesses the number, output to the user that it is game over and output that what was the random number 
            if (guess != randomNumber)
            {
                System.out.println("Game over! The number was " + randomNumber);
            }
            
            // Or else if the number is guessed, ask the user if he wants to play again
            else
            {
                // Output to the user that he is right 
                System.out.println("The number you have guessed is right!");
                // Prompt to the user if he wants to play again
                System.out.println("Do you want to play again? Yes or no?");
                // Get input from the user
                answer = kb.next();
                // Transform the users answer to lower case to ignore the case sensitivity of Java
                answer = answer.toLowerCase();
        
                // If the answer of the user is equal to "no", the System should exit
                if (answer.equals("no")) 
                {
                    // Outputting a nice message
                    System.out.println("Thanks for playing! Goodbye!");
                    System.exit(0);
                }
            }
        // Do while loop if the answer of the use if equal to yes 
        }while (answer.equals("yes"));
        

    }
}