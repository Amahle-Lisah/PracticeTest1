package com.mycompany.questiontwo;
import java.util.Scanner;
/**
 * This is the class that runs the program. It asks the user for the repair
 * details at runtime, creates a ComputerRepairReport object with those
 * details, and then displays the report.
 *
 * @author Amahle Lisah Khumalo
 */

public class RunApplication {

    public static void main(String[] args) {
        // Scanner object used to read user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Get the computer repair details from the user
        System.out.print("Enter the computer type: ");
        String computerType = input.nextLine();

        System.out.print("Enter the technician's name: ");
        String technician = input.nextLine();

        System.out.print("Enter the total number of repairs: ");
        int repairTotal = input.nextInt();

        // Create a ComputerRepairReport object using the values entered above
        ComputerRepairReport report = new ComputerRepairReport(computerType, technician, repairTotal);

        // Call the method to print the report
        report.printRepairReport();

        // Close the Scanner since we no longer need to read input
        input.close();
    }
}//End of class