/* Author: Briggs Richardson, Class: CSE360, Date: 10/02/2020
   Basic version control testing using a test file */
package cse360assignment02;

/**
 * AddingMachine is a class that takes a value, initially 0, and
 * can add/subtract to the value, and display it back
 */
public class AddingMachine {
    private int total;

    /**
     * Constructor for the AddingMachine class.
     * It initializes the data memeber: total to 0
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Accessor function
     * @return value of data member: total
     */
    public int getTotal () {
        return 0;
    }

    /**
     * Mutator function for the data member: total
     * @param value total is updated to itself plus argument: value
     */
    public void add (int value) {
    }

    /**
     * Mutator function for the data member: total
     * @param value total is updated to itself minus argument: value
     */
    public void subtract (int value) {
    }

    /**
     * toString summarizes the object's information
     * @return a empty String
     */
    public String toString () {
        return "";
    }

    /**
     * Clear resets the data member: total to 0.
     */
    public void clear() {
    }

    /**
     * Main function used to test class AddingMachine
     * @param args arguments provided in terminal execution
     */
    public static void main (String[] args) {

    }
}