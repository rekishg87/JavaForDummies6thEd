package chapters.chapter13.examples;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/18/2015.
 */
public class InventoryB {

    public static void main(String args[]) {
        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency =
                NumberFormat.getCurrencyInstance();

        out.print("How many boxes do we have? ");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            out.print("The value is ");
            out.println
                    (currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            out.println("That's not a number.");
            System.err.println("Message: ***" + e.getMessage() + "***");
            e.printStackTrace();
        }

        keyboard.close();
    }
}
