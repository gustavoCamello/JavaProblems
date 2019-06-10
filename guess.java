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

public class guess {
	//variables
	int secretNumber;
	int guessNumber;
	String compared;
	
	//constructor
	public guess () {
		secretNumber = (int) (Math.random()*11);
		guessNumber = 0;
		compared = "xxx";
	}
	
	//set methods
	
	public void setGuess (int guessNumber) {
		this.guessNumber = guessNumber;
	}
	
	//compute
	public String computeGuess() {
		if (secretNumber == guessNumber) {
			return compared = guessNumber + "Congratulations, you guessed correcttly" + "\n correct " + secretNumber;
		}else if(secretNumber < guessNumber){
			return compared = guessNumber + "You guessed too high, sorry!" + "\n correct " + secretNumber;
		}else if(secretNumber > guessNumber) {
			return compared = guessNumber + "You guessed to low, sorry!"  + "\n correct " + secretNumber;
		}
		return compared;
	}
	
	//retunr
	public String getGuess () {
		return compared;
	}
}
