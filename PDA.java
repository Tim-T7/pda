/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (true) {
            System.out.println ("How old are you?");
            try {
                Scanner scanner = new Scanner (System.in);
                int age = 0;
                age = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
            int LOWER_BOUND = 0;
            int age = 0;
            if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!!");
            }
            int lowerrange = (age/2)+7;
            int upperrange = (age-7)*2;
            System.out.println ("you can date people from " + lowerrange + " to " + upperrange);
        }

    }
    
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

