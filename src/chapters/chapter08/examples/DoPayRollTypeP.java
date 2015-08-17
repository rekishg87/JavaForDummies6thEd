package chapters.chapter08.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Rekish on 8/14/2015.
 */
public class DoPayRollTypeP {

    public static void main(String args[]) throws IOException {
        Scanner diskScanner =
                new Scanner(new File("EmpInfoNew.txt"));
        Scanner kbdScanner = new Scanner(System.in);

        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneFTEmployee(diskScanner);
        }

        for (int empNum = 4; empNum <= 6; empNum++) {
            payOnePTEmployee(diskScanner, kbdScanner);
        }
    }

    public static void payOneFTEmployee(Scanner diskScanner) {
        FullTimeEmployee employee = new FullTimeEmployee();

        employee.setName(diskScanner.nextLine());
        employee.setJobTitle(diskScanner.nextLine());
        employee.setWeeklySalary(diskScanner.nextDouble());
        employee.setBenefitDeduction(diskScanner.nextDouble());
        diskScanner.nextLine();
        diskScanner.nextLine();     // Reads the dashed line that
                                    // seperates two employees
        employee.cutCheck(employee.findPaymentAmount());
        out.println();
    }

    public static void payOnePTEmployee
            (Scanner diskScanner, Scanner kbdScanner) {
        PartTimeEmployee employee = new PartTimeEmployee();

        employee.setName(diskScanner.nextLine());
        employee.setJobTitle(diskScanner.nextLine());
        employee.setHourlyRate(diskScanner.nextDouble());
        diskScanner.nextLine();
        diskScanner.nextLine();     // Reads the dashed line that
                                    // seperates two employees

        out.print("Enter ");
        out.print(employee.getName());
        out.print("'s hours worked this week: ");
        int hours = kbdScanner.nextInt();

        employee.cutCheck(employee.findPaymentAmount(hours));
        out.println();
    }
}
