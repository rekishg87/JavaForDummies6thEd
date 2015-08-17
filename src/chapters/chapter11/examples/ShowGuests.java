package chapters.chapter11.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class ShowGuests {

    public static void main(String args[]) throws IOException {
        int guests[] = new int[10];
        Scanner diskScanner =
                new Scanner(new File("GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        out.println("Room\tGuests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guests[roomNum]);
        }

        diskScanner.close();
    }
}
