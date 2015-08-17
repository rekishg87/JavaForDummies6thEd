package chapters.chapter11.examples;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class ShowGuests3 {

    public static void main(String args[]) {
        int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        int roomNum = 0;

        out.println("Room\tGuests");
        for (int numGuests : guests) {
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuests);
        }
    }
}
