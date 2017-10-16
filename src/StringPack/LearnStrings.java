package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	private String word = "";

	 public LearnStrings(String s)
	   {
	      setString(s);
	   } // end of constructor
	 
	 
	 public void setString(String s)
	   {
		 //do tests to make sure you are getting a legit input
			word = s;
			//System.out.println("String entered is: " + word);
			String msg = "String entered is: " + word;
			JOptionPane.showMessageDialog(null, msg);
	   
	   } // end of method setString
	 
	 public char getFirstLetter() {
		 
		 return word.charAt(0);
		 
	 } // end of method getFirstLetter


	public int getLength() {
		
		
		return word.length();
	}
	 
	public char getLastLetter() {
		
		return word.charAt(word.length()-1);
		
		
	}


	public String getMiddle() {
		
		
		return word.substring(1, word.length()-1);
	}
	
	/*
	 * setters -- purpose is to control setting vars
	 * another name is "modifier" methods and older name is "mutator" method
	 * 
	 * getter -- purpose is to retrieve vars also in a controlled way
	 * another name is "accessor" method
	 */

} // end of class LearnStrings
