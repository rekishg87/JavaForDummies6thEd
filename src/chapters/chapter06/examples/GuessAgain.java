package chapters.chapter06.examples;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/13/2015.
 */
public class GuessAgain {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println("\t\t ***********");
        out.println("Welcome to the Guessing Game");
        out.println("\t\t ***********");
        out.println();

        out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again....");
            out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }

        out.print("You win after ");
        out.println(numGuesses + " guesses.");

        keyboard.close();
    }
}
