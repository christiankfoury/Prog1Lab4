/** 
 * @author Christian Kfoury 
 * This program uses a for loop to output the sum of all the integer between 10 and 20 inclucive*/ 
public class Question44 {
    public static void main(String[] args) {
        // Setting the base value of the number between 10 and 20 in an integer
        int ten = 10;
        // Creating a for loop that will do the sum of the number between 10 and 20
        // by using an integer i (itteration) to repeat 10 ten times because there is 10 number between 10 and 20 
        for (int i = 1; i <= 10; i++){
            // The new value of 10 is 10+ 10 + (the current itteration)
            ten = ten + 10 + i;
        }
        // Output the answer
        System.out.println("The sum of all the integer numbers between 10 and 20 inclucive is : " + ten);
    }
}