package chapters.chapter08.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Rekish on 8/14/2015.
 */
public class DoPayRoll {

    public static void main(String args[]) throws IOException {
        Scanner diskScanner =
                new Scanner(new File("EmployeeInfo.txt"));

        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);
        }

        diskScanner.close();
    }

    static void payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();

        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
