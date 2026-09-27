package com.mycompany.questiontwo;

/**
 * This interface acts as a contract for any class that represents a computer
 * repair record. It lists the methods that must be provided, without saying
 * how they should work - that part is left to the class that implements it.
 *
 * @author Amahle Lisah Khumalo
 */
public interface IComputerRepair
{
    // Returns the type of computer that was repaired (e.g. Laptop, Desktop)
    String getComputerType();

    // Returns the name of the technician who did the repair
    String getTechnician();

    // Returns the total number of repairs done
    int getRepairTotal();
}//End of class