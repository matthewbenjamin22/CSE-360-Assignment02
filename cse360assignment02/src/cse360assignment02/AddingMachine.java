/**
 * AddingMachine.java
 * Created for CSE 360 Assignment 1 (Referred to as assignment02 by code despite being assignment 1)
 * @Author Matthew Benjamin
 * Student ID 1214379491
 */

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String memory;
  
  /**
 *	Constructor 
 *	Initializes values to a default
 */
public AddingMachine () 
{
    total = 0;
    memory = "0";
}
  
  /**
 * Accessor method
 * @return total
 */
public int getTotal () 
{
    return total;
}
  
  /**
 * Adds value to total and updates operation in memory
 * @param value
 */
public void add (int value) 
{
	total += value;
	memory += " + " + value;
}

  /**
 * Subtract value to total and updates operation in memory
 * @param value
 */
public void subtract (int value) 
{
	total -= value;
	memory += " - " + value;
}

/**
 * toString Method
 * @return the String result
 */
public String toString () 
{
    return memory;
}

  /**
 * Clear method
 * Resets total and memory
 */
public void clear() 
{
	memory = "0";
	total = 0;
}

}