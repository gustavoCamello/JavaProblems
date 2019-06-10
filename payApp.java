/*
 * Having just started college, Bob has been busy looking for a part-time job to fund his new
 *  college social life and after only two weeks of looking he has managed to get two job offers!  
 *  Each job comes with different hours, basic rates of pay and over-time rates so he needs to work
 *   out which would get him the most money. 

Develop an application that would allow Bob to enter his basic pay rate, his number of basic hours 
work per week and his number of overtime hours per week.  The application should then calculate and 
display Bobs basic pay for the week, his overtime pay for the week and his total pay including overtime. 

Your application should use instantiable classes to separate the calculations from the user input and output.

Save the instantiable class as Pay.java

Note: The overtime rate is 1.5 times the basic pay rate.
 */

/* ******************************************************************************************** */

/*
 * @author: Gustavo Camello
 * @date: 29/02/2019
 * @file: Pay.java
 */

import java.util.Scanner;

public class payApp {
	public static void main (String args []) {
		
		//declare variables
		double basicPayRate, numberHours, overtime, totalPay, valueBasicPayRate, valueOvertime = 0;
		
		//create objects
		Scanner keyboard;
		keyboard = new Scanner (System.in);
		
		Pay myCalc;
		myCalc = new Pay ();
		
		//system in
		System.out.println("Please inform the basic pay rate ");
		basicPayRate = keyboard.nextDouble();
		
		System.out.println("Please inform the Number of hours ");
		numberHours = keyboard.nextDouble();
		
		System.out.println("Please inform the overtime");
		overtime = keyboard.nextDouble();
		
		//calculations
		myCalc.setBasicPayRate(basicPayRate);
		myCalc.setNumberHours(numberHours);
		myCalc.setOvertime(overtime);
		myCalc.computeValueBasicPayRate();
		myCalc.computeValueOvertime();
		myCalc.computeTotalPay();
		valueBasicPayRate = myCalc.getValueBasicPayRate();
		overtime = myCalc.getValueOvertime();
		totalPay = myCalc.getTotalPay();
		
		//System out
		System.out.println("The basic pay rate per hour is " + basicPayRate);
		System.out.println("The basic pay per week " + valueBasicPayRate);
		System.out.println("The overtime hours is " + overtime);
		System.out.println("The value of overtime is " + valueOvertime);
		System.out.println("The total pay including overtime is " + totalPay);
		
		
	}
}
