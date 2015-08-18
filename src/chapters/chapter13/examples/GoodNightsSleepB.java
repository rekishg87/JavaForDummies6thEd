package chapters.chapter13.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/18/2015.
 */
public class GoodNightsSleepB {

    public static void main(String args[]) {
        out.print("Excuse me while i take a nap ");
        out.println("for just about 5 seconds.....");

        try {
            takeANap();
        } catch (InterruptedException e) {
            out.println("Hey, who woke me up?");
        }

        out.println("Ah, that was refreshing.");
    }

    static void takeANap() throws InterruptedException{
        Thread.sleep(5000);
    }
}
