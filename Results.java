
/*
 * Develop an application that will store the quiz results of 10 students across three quizzes. 
 * The application should accept all of the quiz results for each student in turn from the user and then
 *  calculate and output the best and worst quiz result from the whole set.

Your application should be developed using instantiable classes and should make use of arrays.  Save the instantiable class as Results.java.
 * 
 */


/* ************************************************************************ */

/*
 * @author: Gustavo Camello
 * @date: 27/04/2019
 * @file: Pay.java
 */

public class Results {
	//declare variables
	private double arr [] [] = new double [10] [3];
	private double best = 0;
	private double worst = 0;
	private double min [] = new double [10];
	private double max [] = new double [10];
	
	
	//set methods
	public void setArr (double arr [] []) {
		this.arr = arr;
	}
	
	//compute method
	public void compute () {
		for (int studentNumber = 0; studentNumber <arr.length; studentNumber++) {
			best = 0;
			worst = arr[studentNumber][0];

			
			for (int quiz = 0; quiz <arr[0].length; quiz++) {
				
				if (worst > arr[studentNumber][quiz] ) {
					worst = arr [studentNumber] [quiz];
				}
				if (best < arr[studentNumber][quiz]) {
					best = arr [studentNumber] [quiz];
				}
			}
			
			
			min [studentNumber] = worst;
			max [studentNumber] = best;
			
		}
	}
	
	//get method
	public double[] getMin () {
		return min;
	}
	
	public double [] getMax () {
		return max;
	}
	
}
