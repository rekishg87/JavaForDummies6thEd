package chapters.chapter10.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class GetGoing {

    public static void main(String args[]) {
        out.println("main is running:");

        EnglishSpeakingWorld englishSpeakingWorld =
                new EnglishSpeakingWorld();

        // out.println(mars);   cannot resolve symbol
        out.println(englishSpeakingWorld.mars);
        englishSpeakingWorld.visitPennsylvania();
    }
}
