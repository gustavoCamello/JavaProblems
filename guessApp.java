/*
 * You have been asked to develop a Guessing Game application that allows the user to compete
 *  with the computer to guess a secret number.   The application should generate a random number
 *   between 1 and 10 and then ask the user to enter one single number between 1 and 10 to guess 
 *   what the secret number is.   The application should compare the users guess with the secret 
 *   number and return one of the following messages:

Correct Guess – “Congratulations, you guessed correctly!”

Higher than the secret number – “You guessed too high, sorry!”

Lower than the secret number – “you guessed to low, sorry!”

The application should also tell the user what the secret number was.

Hint 1: The guess and secret number should be compared in the compute method and the message 
should be returned from the instantiable class to the app class

Hint 2: The Math class contains a method for generating Random numbers

Your application should be developed using instantiable classes and should make use of the JOptionPane class for input and output.

Save your instantiable class as Guess.java
 */

/* ********************************************************************************** */

/*
 * @author: Gustavo Camello
 * @date: 23/02/2019
 * @file: Eggs.java
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class guessApp {
	
	public static void main (String args []) {
	
	int guessNumber;
	int secretNumber = 0;
	//objects
	
	guess myGuess;
	myGuess = new guess();
	
	guessNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your guess number"));
	myGuess.setGuess(guessNumber);
	
	
	
	//set methods
	myGuess.setGuess(guessNumber);
	myGuess.computeGuess();
	String compared = myGuess.getGuess();
	
	
	JOptionPane.showMessageDialog(null, "The guessed number is " + compared);
	
	/*if (secretNumber == guessNumber) {
		System.out.println("Congratulations, you guessed correcttly");
	}else if(secretNumber < guessNumber){
		System.out.println("You guessed too high, sorry!");
	}else if(secretNumber > guessNumber) {
		System.out.println("You guessed to low, sorry!");
	}*/
	
	
}
}