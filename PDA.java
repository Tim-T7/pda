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
            float age = 0;
            int LOWER_BOUND = 14;
            Scanner scanner = new Scanner (System.in);
            try{
                age = scanner.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
            if ( age == 0) {
                break;
            }
            if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!!");
            } else {
                int lowerrange = Math.round((age/2)+7);
                int upperrange = Math.round((age-7)*2);
                System.out.println ("you can date people from " + lowerrange + " to " + upperrange);
            }

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

