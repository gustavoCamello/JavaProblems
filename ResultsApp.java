
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


import javax.swing.JOptionPane;

public class ResultsApp {
	public static void main (String args []) {
		double arr [][] = new double [10] [3];
		double min [] = new double [10];
		double max [] = new double [10];
		
		//declare objects
		Results myResults = new Results ();
		
		// input
		for (int studentNumber = 0; studentNumber < arr.length; studentNumber++) {
			for (int quiz  = 0; quiz < arr[0].length; quiz++) {
				arr [studentNumber][quiz] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the result for " + (studentNumber + 1) + " in the quiz" + (quiz + 1) + " : "));
				
			}
		}
		
		myResults.setArr(arr);
		myResults.compute();
		min = myResults.getMin();
		max = myResults.getMax();

		for (int studentNumber = 0; studentNumber <arr.length; studentNumber++) {
			JOptionPane.showMessageDialog(null, "Student Number: " + (studentNumber + 1) + ". Highest results = " + max[studentNumber] + " and lowest result" + min[studentNumber]);
		}
		
	}
}
