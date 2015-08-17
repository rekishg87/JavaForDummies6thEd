package chapters.chapter09.examples;

/**
 * Created by Rekish on 8/14/2015.
 */
public class UseTemperaturNice {

    public static void main(String args[]) {
        TemperatureNice temperatureNice = new TemperatureNice();

        temperatureNice.setNumber(70.0);
        temperatureNice.setScale(TempScale.FAHRENHEIT);
        temperatureNice.display();

        temperatureNice = new TemperatureNice(32.0);
        temperatureNice.display();

        temperatureNice = new TemperatureNice(TempScale.CELSIUS);
        temperatureNice.display();

        temperatureNice = new TemperatureNice(2.73, TempScale.KELVIN);
        temperatureNice.display();
    }
}
