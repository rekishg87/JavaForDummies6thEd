package chapters.chapter10.examples;

/**
 * Created by Rekish on 8/17/2015.
 */
public class TrackPopulation2 {

    public static void main(String args[]) {
        int smackARPop = 2232;

        smackARPop = birth(smackARPop);
        System.out.println(smackARPop);
    }

    static int birth(int cityPop) {
        return cityPop + 1;
    }
}
