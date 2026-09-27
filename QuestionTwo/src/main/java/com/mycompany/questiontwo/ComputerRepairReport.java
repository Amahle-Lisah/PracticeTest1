/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questiontwo;

/**
 *
 * @author Amahle Lisah Khumalo
 */

// Subclass that extends ComputerRepair and adds a method to print the report
public class ComputerRepairReport extends ComputerRepair
{
    // Constructor that passes the values up to the parent class (ComputerRepair)
    public ComputerRepairReport(String computerType, String technician, int repairTotal)
    {
        super(computerType, technician, repairTotal);
    }

    // Method that prints the computer repair report
    public void printRepairReport()
    {
        System.out.println("\nCOMPUTER REPAIR REPORT");
        System.out.println("------------------------------------------------");
        System.out.println("COMPUTER TYPE:   " + getComputerType());
        System.out.println("TECHNICIAN:      " + getTechnician());
        System.out.println("TOTAL REPAIRS:   " + getRepairTotal());
        System.out.println("------------------------------------------------");
    }
}