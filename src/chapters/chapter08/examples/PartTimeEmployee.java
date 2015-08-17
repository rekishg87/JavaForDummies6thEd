package chapters.chapter08.examples;

/**
 * Created by Rekish on 8/14/2015.
 */
public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double findPaymentAmount(int hours) {
        return hourlyRate * hours;
    }
}
