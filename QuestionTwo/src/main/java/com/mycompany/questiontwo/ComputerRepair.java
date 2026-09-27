package com.mycompany.questiontwo;
/**
 * This abstract class implements IComputerRepair and provides the actual
 * data storage (variables), the constructor, and the get methods that the
 * interface promises. It is "abstract" because it is not meant to be used
 * on its own - a subclass (ComputerRepairReport) is used to create objects.
 *
 * @author Amahle Lisah Khumalo
 */

public abstract class ComputerRepair implements IComputerRepair
{
    // Variables to store the computer type, technician name and total repairs
    // These are private so they can only be accessed through the get methods below
    private String computerType;
    private String technician;
    private int repairTotal;

    // Constructor that accepts the computer type, technician and number of repairs
    // and stores them in the variables above
    public ComputerRepair(String computerType, String technician, int repairTotal)
    {
        this.computerType = computerType;
        this.technician = technician;
        this.repairTotal = repairTotal;
    }

    // Get method for the computer type
    public String getComputerType()
    {
        return computerType;
    }

    // Get method for the technician
    public String getTechnician()
    {
        return technician;
    }

    // Get method for the total repairs
    public int getRepairTotal()
    {
        return repairTotal;
    }
}//End of class