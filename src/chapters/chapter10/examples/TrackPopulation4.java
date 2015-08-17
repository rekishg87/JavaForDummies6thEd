package chapters.chapter10.examples;

/**
 * Created by Rekish on 8/17/2015.
 */
public class TrackPopulation4 {

    public static void main(String args[]) {
        City smackARPop = new City();
        smackARPop.population = 2232;
        smackARPop = doBirth(smackARPop);
        System.out.println(smackARPop.population);
    }

    static City doBirth(City aCity) {
        City myCity = new City();
        myCity.population = aCity.population + 1;
        return myCity;
    }
}
