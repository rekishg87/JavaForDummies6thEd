package chapters.chapter10.examples;

/**
 * Created by Rekish on 8/17/2015.
 */
public class TrackPopulation3 {

    public static void main(String args[]) {
        City smackARPop = new City();
        smackARPop.population = 2232;
        birth(smackARPop);
        System.out.println(smackARPop.population);
    }

    static void birth(City aCity) {
        aCity.population++;
    }
}
