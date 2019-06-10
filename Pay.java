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


public class Pay {
	//declare variables
	double basicPayRate, numberHours, overtime, totalPay, valueBasicPayRate, valueOvertime;
	
	//constructor
	public Pay () {
		basicPayRate = 0;
		numberHours = 0;
		overtime = 0;
	}
	
	//set methods
	
	public void setBasicPayRate (double basicPayRate) {
		this.basicPayRate = basicPayRate;
	}
	
	public void setNumberHours (double numberHours) {
		this.numberHours = numberHours;
	}
	
	public void setOvertime (double overtime) {
		this.overtime = overtime;
	}
	
	//calculations
	
	public void computeValueBasicPayRate () {
		valueBasicPayRate = basicPayRate * numberHours;
	}
	
	public double getValueBasicPayRate () {
		return valueBasicPayRate;
	}
	
	public void computeValueOvertime () {
		valueOvertime = (basicPayRate*1.5) * overtime;
	}
	
	public double getValueOvertime () {
		return valueOvertime;
	}
	
	public void computeTotalPay () {
		totalPay = valueOvertime + valueBasicPayRate;
	}
	
	public double getTotalPay () {
		return totalPay;
	}
}