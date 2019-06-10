/*
 * You have been asked to develop an application that accepts a word from the user and swaps 
 * the first and last letters in that word.  The resultant String should be displayed to the user.

Your application should be developed using instantiable classes and should make use of the JOptionPane
 class for input and output.
 */

/* ************************************************************************************* */

/*
 * Change.java
 * Gustavo Camello
 * 13/04/2019
 */


public class Change {
	private String word;
	private String newWord;
	private StringBuffer buff;
	
	public Change() {
		word = "";
		newWord = "";
		buff = new StringBuffer();
	}
	
	public void setWord (String word) {
		this.word = word;
	}
	
	public void compute() {
		
		//for the last letter
		buff.append(word.charAt(word.length()-1));
		
		
		for (int i = 1; i < word.length()-1; i = i+ 1 ) {
			buff.append(word.charAt(i));
		}
		
		buff.append(word.charAt(0));
		
		newWord = buff.toString();
	
	}
	
	public String getNewWord() {
		return newWord;
	}
}
