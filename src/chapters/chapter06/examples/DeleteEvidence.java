package chapters.chapter06.examples;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/13/2015.
 */
public class DeleteEvidence {

    public static void main(String args[]) {
        File evidence = new File("cookedBooks.txt");
        if (evidence.exists()) {
            Scanner keyboard = new Scanner(System.in);
            char reply;

            do {
                out.print("Delete evidence? (y/n) ");
                reply =
                        keyboard.findWithinHorizon(".", 0).charAt(0);

            } while (reply != 'y' && reply != 'Y'
                    && reply != 'n' && reply != 'N');

            if (reply == 'y' || reply == 'Y') {
                out.println("Okay, here goes...");
                evidence.delete();
                out.println("The evidence has been deleted.");
            } else {
                out.println("Sorry, buddy. Just asking.");
            }

            keyboard.close();
        }
    }
}
