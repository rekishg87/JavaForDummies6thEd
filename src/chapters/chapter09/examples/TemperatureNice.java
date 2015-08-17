package chapters.chapter09.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/14/2015.
 */
public class TemperatureNice extends Temperature {
    final String format = "%5.2f degrees %s\n";

    public TemperatureNice() {
        super();
    }

    public TemperatureNice(double number) {
        super(number);
    }

    public TemperatureNice(TempScale scale) {
        super(scale);
    }

    public TemperatureNice(double number, TempScale scale) {
        super(number, scale);
    }

    public void display() {
        out.printf(format, this.getNumber(), this.getScale());
    }
}
