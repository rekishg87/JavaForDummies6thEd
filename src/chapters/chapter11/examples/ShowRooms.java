package chapters.chapter11.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class ShowRooms {

    public static void main(String args[]) throws IOException {
        Room rooms[];
        rooms = new Room[10];

        Scanner diskScanner =
                new Scanner(new File("RoomList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }

        out.println("Room\tGuests\tRate\tSmoking?");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t\t\t");
            rooms[roomNum].writeRoom();
        }
        diskScanner.close();
    }
}
