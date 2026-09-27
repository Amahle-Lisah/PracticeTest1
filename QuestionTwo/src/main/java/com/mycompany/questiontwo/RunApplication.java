/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questiontwo;
import java.util.Scanner;
/**
 *
 * @author Amahle Lisah Khumalo
 */

public class RunApplication {

    public static void main(String[] args) {
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

        input.close();
    }
}