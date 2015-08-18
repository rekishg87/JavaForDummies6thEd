package chapters.chapter13.examples;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/18/2015.
 */
public class InventoryLoop {

    public static void main(String args[]) {
        final double boxPrice = 3.25;
        boolean gotGoodInput = false;
        Scanner keyboard =
                new Scanner(System.in);
        NumberFormat currency =
                NumberFormat.getCurrencyInstance();

        do {
            out.print("How many boxes do we have? ");
            String numBoxesIn = keyboard.next();

            try {
                int numBoxes = Integer.parseInt(numBoxesIn);
                out.print("The value is ");
                out.println
                        (currency.format(numBoxes * boxPrice));
                gotGoodInput = true;
            } catch (NumberFormatException e) {
                out.println();
                out.println("That's not a number.");
            }
        } while (!gotGoodInput);

        out.println("That's that.");

        keyboard.close();
    }
}
