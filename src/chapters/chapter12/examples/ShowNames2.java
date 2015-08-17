package chapters.chapter12.examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class ShowNames2 {

    public static void main(String args[]) throws IOException {
        ArrayList<String> people = new ArrayList<String>();
        Scanner diskScanner =
                new Scanner(new File("names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        people.remove(0);
        people.add(2, "Jim Newton");

        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            out.println(iterator.next());
        }

        diskScanner.close();
    }
}
