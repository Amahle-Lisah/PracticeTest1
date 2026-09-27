/*
* CODE ATTRIBUTIONS 
 * Title: Classes and Objects in Java
 * Author: GeeksForGeeks
 * Date: 8/09/2026
 * Version: 1
 * Availability: https://www.geeksforgeeks.org/java/classes-objects-java/
 *
 * Title: Scanner Class in Java
 * Author: GeeksforGeeks
 * Date: 13/08/2026
 * Version: 1
 * Availability: https://www.geeksforgeeks.org/java/scanner-class-in-java/
 * 
 * Title: Static Keyword in Java
 * Author: GeeksForGeeks
 * Date: 8/09/2026
 * Version: 1
 * Availability: https://www.geeksforgeeks.org/java/static-keyword-java/
 *
 * Title: Print a 2D Array or Matrix in Java
 * Author: GeeksForGeeks
 * Date: 8/09/2026
 * Version: 1
 * Availability: https://www.geeksforgeeks.org/java/print-2-d-array-matrix-java/
 *
 * CHANGE THE DATE!!!!
*/

package com.mycompany.questionone;
import java.util.Scanner;
/**
 * This program records the number of Android and iPhone sales for three
 * branches, calculates the total sales for each branch, and displays a
 * report showing which branch had the highest total sales.
 *
 * @author Amahle Lisah Khumalo
 */
public class QuestionOne {

    public static void main(String[] args) {
        // Scanner object used to read user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Single (1D) array to store the branch names
        String[] branches = {"Durban", "Cape Town", "Johannesburg"};

        // Two-dimensional array to store sales numbers
        // Each row = a branch, column 0 = Android sales, column 1 = iPhone sales
        int[][] sales = new int[3][2];

        // Single (1D) array to store the total sales per branch
        // (Android sales + iPhone sales for that branch)
        int[] totals = new int[3];

        // ---------- Get input from the user ----------
        // Loop through each branch and ask the user for Android and iPhone sales
        for (int i = 0; i < branches.length; i++) {
            System.out.print("Enter the number of Android phones sold in " + branches[i] + ": ");
            sales[i][0] = input.nextInt(); // store Android sales in column 0

            System.out.print("Enter the number of iPhones sold in " + branches[i] + ": ");
            sales[i][1] = input.nextInt(); // store iPhone sales in column 1
        }

        // ---------- Calculate totals for each branch ----------
        // Add Android sales and iPhone sales together for each branch
        for (int i = 0; i < branches.length; i++) {
            totals[i] = sales[i][0] + sales[i][1];
        }

        // ---------- Print the report table ----------
        // Display the report heading and column titles
        System.out.println("\nCELL PHONE SALES REPORT");
        System.out.println("------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Branch", "Android", "iPhone", "Total");

        // Loop through each branch and print its row of data
        for (int i = 0; i < branches.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d%n", branches[i], sales[i][0], sales[i][1], totals[i]);
        }

        System.out.println("------------------------------------------------");

        // ---------- Find the branch with the highest total ----------
        // Start by assuming the first branch (index 0) has the highest total
        int highestIndex = 0;

        // Compare every other branch's total to the current highest
        // and update highestIndex whenever a bigger total is found
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }

        // Print the name of the branch with the highest total sales
        System.out.println("BRANCH WITH THE HIGHEST TOTAL: " + branches[highestIndex]);

        // Close the Scanner since we no longer need to read input
        input.close();
    }
}

