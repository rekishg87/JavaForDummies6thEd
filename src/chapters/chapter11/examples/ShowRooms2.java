package chapters.chapter11.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/17/2015.
 */
public class ShowRooms2 {

    public static void main(String args[]) throws FileNotFoundException {
        Room rooms[][] = new Room[5][10];
        Scanner diskScanner =
                new Scanner(new File("RoomList"));

        for (int floor = 0; floor < 5; floor++) {
            for (int roomNum = 0; roomNum < 10; roomNum++) {
                rooms[floor][roomNum] = new Room();
                rooms[floor][roomNum].readRoom(diskScanner);
            }
        }

        for (int floor = 4; floor >= 0; floor--) {
            out.println("Floor " + floor + ":");
            for (int roomNum = 0; roomNum < 10; roomNum++) {
                out.print("   ");
                rooms[floor][roomNum].writeRoom();
            }
            out.println();
        }
        diskScanner.close();
    }
}
