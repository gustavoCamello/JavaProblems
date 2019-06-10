/*
 * You have been asked to develop an application that accepts a word from the user and swaps 
 * the first and last letters in that word.  The resultant String should be displayed to the user.

Your application should be developed using instantiable classes and should make use of the JOptionPane
 class for input and output.
 */

/* ************************************************************************************* */

/*
 * ChangeApp.java
 * Gustavo Camello
 * 13/04/2019
 */

import javax.swing.JOptionPane;
public class ChangeApp {

	public static void main (String args []) {
		String word;
		String newWord;
		
		Change myChange = new Change();
		
		word = JOptionPane.showInputDialog(null, "Please enter the word");
		myChange.setWord(word);
		
		myChange.compute();
		
		newWord = myChange.getNewWord();
		
		JOptionPane.showMessageDialog(null, "The anwser is >>>" + newWord);
		
	}
}
