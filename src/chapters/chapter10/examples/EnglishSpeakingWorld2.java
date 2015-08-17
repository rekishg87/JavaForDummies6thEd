package chapters.chapter10.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class EnglishSpeakingWorld2 {
    String mars;

    void visitIdaho() {
        out.println("visitIdaho is running:");

        mars = "   red planet";
        String atomicCity = "   Population: 25";

        out.println(mars);
        out.println(atomicCity);
    }

    void visitNewJersey() {
        out.println("visitNewJersey is running:");

        out.println(mars);
        // out.println(atomicCity) cannot resolve symbol
    }
}
