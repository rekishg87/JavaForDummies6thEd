package chapters.chapter05.examples;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rekish on 8/13/2015.
 */
public class DontTellThemTheyLost {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter an int from 1 to 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            out.println("*You Win!*");
        }

        out.println("That was a very good guess :-)");
        out.print("The random number was ");
        out.println(randomNumber + ".");
        out.println("Thank you for playing.");

        keyboard.close();
    }
}
