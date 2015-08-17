package chapters.chapter10.examples;

import java.text.DecimalFormat;

/**
 * Created by Rekish on 8/17/2015.
 */
public class PlayerPlus extends Player {
    private static int playerCount = 0;
    private static double totalOfAverages = .000;
    private static DecimalFormat decimalFormat =
            new DecimalFormat();

    static {
        decimalFormat.setMaximumIntegerDigits(0);
        decimalFormat.setMaximumFractionDigits(3);
        decimalFormat.setMinimumFractionDigits(3);
    }

    public PlayerPlus(String name, double average) {
        super(name, average);
        playerCount++;
        totalOfAverages += average;
    }

    public static double findTeamAverage() {
        return totalOfAverages / playerCount;
    }

    public static String findTeamAverageString() {
        return decimalFormat.format(totalOfAverages / playerCount);
    }
}
