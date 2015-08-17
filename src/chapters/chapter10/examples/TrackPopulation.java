package chapters.chapter10.examples;

/**
 * Created by Rekish on 8/17/2015.
 */
public class TrackPopulation {

    public static void main(String args[]) {
        int smackOverARPop = 2232;

        birth(smackOverARPop);
        System.out.println(smackOverARPop);
    }

    static void birth(int cityPop) {
        cityPop++;
    }
}
