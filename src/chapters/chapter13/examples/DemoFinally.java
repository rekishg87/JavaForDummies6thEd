package chapters.chapter13.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/18/2015.
 */
public class DemoFinally {

    public static void main(String args[]) {
        try {
            doSomething();
        } catch (Exception e) {
            out.println("Exception caught in main.");
        }
    }

    static void doSomething() {
        try {
            out.println(0 / 0);
        } catch (Exception e) {
            out.println
                    ("Exception caught in doSomething.");
            out.println(0 / 0);
        } finally {
            out.println("I'll get printed no matter what"
                   + ", good or bad, "
                    + "exception or no exception.");
        }

        out.println("I won't get printed.");
    }
}
