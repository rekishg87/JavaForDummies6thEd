package chapters.chapter13.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/18/2015.
 */
public class GoodNightsSleepA {

    public static void main(String args[]) {
        out.print("Excuse me while i nap ");
        out.println("for just five seconds.....");

        takeANap();

        out.println("Ah, that was refreshing.");
    }

    static void takeANap() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            out.println("Hey, who woke me up?");
        }
    }
}
