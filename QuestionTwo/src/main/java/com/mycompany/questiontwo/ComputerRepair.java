/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questiontwo;

/**
 *
 * @author Amahle Lisah Khumalo
 */

// Abstract class that stores the repair details and implements the interface
public abstract class ComputerRepair implements IComputerRepair
{
    // Variables to store the computer type, technician name and total repairs
    private String computerType;
    private String technician;
    private int repairTotal;

    // Constructor that accepts the computer type, technician and number of repairs
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
}