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
 * @date: 23/02/2019
 * @file: Eggs.java
 */


public class Eggs {
	//data members
	private int eggs, boxes;
	private int result;
	private int left;
	
	//constructor
	public Eggs(){
		eggs = 0;
		boxes = 12;
	}
	
	//set methods
	public void setEggs (int eggs) {
		this.eggs = eggs;
	}
	
	public void setBoxes (int boxes) {
		this.boxes = boxes;
	}
	
	//compute method
	public void computeResult() {
		result = eggs / boxes;
		
	}
	
	public void computeLeft() {
		left = eggs%12;
		if (left > 0) {
			boxes = boxes + 1;
		}
	}
	
	//get method
	public int getResult () {
		return result;
	}
	
	public int getLeft() {
		return left;
	}
}

