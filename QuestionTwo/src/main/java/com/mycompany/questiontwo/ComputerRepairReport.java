package com.mycompany.questiontwo;

/**
 * This subclass extends ComputerRepair, inheriting its variables and get
 * methods. It adds one extra method, printRepairReport(), which displays
 * the repair details in a neatly formatted report.
 *
 * @author Amahle Lisah Khumalo
 */

public class ComputerRepairReport extends ComputerRepair
{
    // Constructor that passes the values up to the parent class (ComputerRepair)
    // using super(), so we don't have to redeclare the same variables again here
    public ComputerRepairReport(String computerType, String technician, int repairTotal)
    {
        super(computerType, technician, repairTotal);
    }

    // Method that prints the computer repair report
    // Uses the inherited get methods to retrieve the stored values
    public void printRepairReport()
    {
        System.out.println("\nCOMPUTER REPAIR REPORT");
        System.out.println("------------------------------------------------");
        System.out.println("COMPUTER TYPE:   " + getComputerType());
        System.out.println("TECHNICIAN:      " + getTechnician());
        System.out.println("TOTAL REPAIRS:   " + getRepairTotal());
        System.out.println("------------------------------------------------");
    }
}//End of class