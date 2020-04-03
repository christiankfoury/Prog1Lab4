// Importing all java classes
import java.util.*;
// This program sees if a word or sentence is palindrome
public class Palindrome{
    public static void main(String[] args) {
        // Creating a string called sentence and rev (for reverse) and giving and empty string as a value
        String sentence, rev = "";
        // Creating a scanner and calling it kb for keyboard
        Scanner kb = new Scanner(System.in);

        // Prompt the user for a word or sentence to see if it is a palindrome
        System.out.println("Enter a word or a sentence to see if it is a palindrome:");
        // Getting input from the user and storing in the string sentence
        sentence = kb.nextLine();
        // If we want to compare two strings, one normal and one reverse, first we have to remove all capitalization
        String oneBigWord = sentence.toLowerCase();
        // Then, by using the method replaceAll regex, we are going to replace all characters that don't match the the range of letter A-Za-z with a empty string
        oneBigWord = oneBigWord.replaceAll("[^A-Za-z]+", "");
        // Now the word/sentence has become one big word and we store the length of that one big word into a integer called length
        int length = oneBigWord.length();

        // Now, using a for loop, we are going to reverse the loop. first condition, the itteration integer is equal to the length - 1
        // then, the second condition, the loop will stop when it reache 0 (whitch can be considered the index of 0 of the word)
        // lastly we are going to decrement by 1 
        for (int i = length - 1; i >= 0; i--) {
            // The reverse string is equal to (empty string) + each letter in reverse 
            rev = rev + oneBigWord.charAt(i);
        }

        // If the word is equal to the word in reverse, it is palinddrome
        if(oneBigWord.equals(rev))
        {
            // Output that the word inputed by the user is a palindrome
            System.out.println(sentence + " is a palindrome");
        }
        // Else if the word is not equal to the word in reverse, it is not palindrome
        else
        {
            // Output to the user that the word inputed is not a palindrome
            System.out.println(sentence + " is not a palindrome");
        }
    }

}