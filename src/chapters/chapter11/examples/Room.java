package chapters.chapter11.examples;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class Room {
    private static NumberFormat currency =
            NumberFormat.getCurrencyInstance();
    private int guests;
    private double rate;
    private boolean smoking;

    public void readRoom(Scanner diskScanner) {
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom() {
        out.print(guests);
        out.print("\t");
        out.print(currency.format(rate));
        out.print("\t");
        out.println(smoking ? "yes" : "no");
    }
}
