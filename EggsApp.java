/*
 * John the farmer has tasked his son with collecting the eggs from the chicken coop each morning and putting them in boxes of 1 dozen eggs each.
 *  Unfortunately Johns son Joe is having trouble working out how many boxes he will need each morning. You have been asked to develop a java 
 *  application to allow Joe to enter the number of eggs he has collected.  The application should then calculate and output how many boxes can 
 *  be filled and how many eggs Joe will have leftover.

Your application should use instantiable classes to separate the calculations from the user input and output.

*Hint: there are 12 eggs in 1 dozen
 */

/* **************************************************************************************** */


/*
 * @author: Gustavo Camello
*/

import java.util.Scanner;

public class EggsApp {

	public static void main (String args[]) {
		//declare variables
		int eggs, boxes;
		int result;
		int left;
		
		//declare objects
		Scanner keyboard;
		Eggs myCalc;
		
		//create objects
		keyboard = new Scanner (System.in);
		myCalc = new Eggs ();
		
		//imput
		System.out.println("Please, enter the number of eggs: ");
		eggs = keyboard.nextInt();
		
		//process i.e. set inputs, do computations, return answers
		myCalc.setEggs(eggs);
		myCalc.computeResult();
		myCalc.computeLeft();
		result = myCalc.getResult();
		left = myCalc.getLeft();
		
		//output
		System.out.println("The numer of eggs is: " + eggs + ". " + "So, you need: " + result + " boxes!" + 
		" and you have: " + left + " eggs left.");
		
	}
	
	
}
