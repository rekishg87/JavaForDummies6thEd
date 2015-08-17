package chapters.chapter11.examples;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

/**
 * Created by Rekish on 8/17/2015.
 */
public class MakeRandomNumsFile {

    public static void main(String args[]) throws IOException {
        Random generator = new Random();

        if (args.length < 2) {
            System.out.println(
                    "Usage: MakeRandomNumsFile filename number");
            System.exit(1);
        }

        PrintStream printOut = new PrintStream(args[0]);
        int numLines = Integer.parseInt(args[1]);

        for (int count = 1; count <= numLines; count++) {
            printOut.println(generator.nextInt(10) + 1);
        }
        printOut.close();

    }
}