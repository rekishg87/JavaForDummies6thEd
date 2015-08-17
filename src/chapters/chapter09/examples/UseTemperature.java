package chapters.chapter09.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/14/2015.
 */
public class UseTemperature {

    public static void main(String args[]) {
        final String format = "%5.2f degrees %s\n";

        Temperature temperature = new Temperature();
        temperature.setNumber(70.0);
        temperature.setScale(TempScale.FAHRENHEIT);
        out.printf(format, temperature.getNumber(),
                temperature.getScale());

        temperature = new Temperature(32.0);
        out.printf(format, temperature.getNumber(),
                temperature.getScale());

        temperature = new Temperature(TempScale.CELSIUS);
        out.printf(format, temperature.getNumber(),
                temperature.getScale());

        temperature = new Temperature(2.73, TempScale.KELVIN);
        out.printf(format, temperature.getNumber(),
                temperature.getScale());
    }
}
