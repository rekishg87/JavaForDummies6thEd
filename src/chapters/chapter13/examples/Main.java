package chapters.chapter13.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Rekish on 8/18/2015.
 */
public class Main {

    public static void main(String args[]) {
        Scanner scan1 = null;
        Scanner scan2 = null;

        try {
            scan1 = new Scanner(new File("File1.txt"));
            scan2 = new Scanner(new File("File2.txt"));
            // Do useful stuff
        } catch (IOException e) {
            // Oops!
        } finally {
            scan1.close();
            scan2.close();
            System.out.println("Done!");
        }
    }
}
