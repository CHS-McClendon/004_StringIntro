package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {

		String msg = "";
		String varWord = "Boise";
		String goAgain = "No";
		Boolean runAgain = true; // George Boole can only be TRUE or FALSE

		// test block, for testing continue or exit
		// as in "Do you want to go again, Y/N?"
		// AP question: What is the diff between a while, and a do-while loop?
		// do-while MUST run at least once
		// while can run zero or many times

		while (runAgain) {
			msg = "Do you want to go again, Y/N?";
			goAgain = JOptionPane.showInputDialog(msg);
			// test goAgain
			// Y, N, y, n, Yes, No, YES, NO;
			if (goAgain.equalsIgnoreCase("y")) {
				msg = "Selection is Y or y";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				msg = "Selection is N or n";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else if (goAgain.equalsIgnoreCase("yes")) {
				msg = "Selection is Yes or yes or YES";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				msg = "Selection is No or no or NO";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else {
				msg = ("Sorry, I don't undertand your input, " + "please try again");
				JOptionPane.showMessageDialog(null, msg);
			}
		} // end of while
		msg = ("Thank you, please play again soon!");
		JOptionPane.showMessageDialog(null, msg);

		msg = "Please enter a string for us to test";
		varWord = JOptionPane.showInputDialog(msg);

		LearnStrings getIt = new LearnStrings(varWord);
		msg = "First char is: " + getIt.getFirstLetter();
		JOptionPane.showMessageDialog(null, msg);

		// test -- try a little code, test immediately, repeat
		int lengthTest = getIt.getLength();
		// msg=("Length = " + lengthTest);
		msg = "Length = " + lengthTest;
		JOptionPane.showMessageDialog(null, msg);

		char lastLetter = getIt.getLastLetter();
		// msg=("Last letter is " + lastLetter);
		msg = "Last letter is " + lastLetter;
		JOptionPane.showMessageDialog(null, msg);

		msg = "middle is " + getIt.getMiddle();
		JOptionPane.showMessageDialog(null, msg);

		/*
		 * thinking, taking notes start: index=1 that will be the second char (remember
		 * index starts at 0) end: .length()-2 WAIT!! REMEMBER "INCLUSIVE, EXCLUSIVE"??
		 * .length()-1
		 * 
		 * use: substring(int beginIndex, int endIndex) .substring(1, word.length()-2)
		 * 
		 * int indexOf(int ch) Returns the index within this string of the first
		 * occurrence of the specified character.
		 * 
		 * int indexOf(String str) Returns the index within this string of the first
		 * occurrence of the specified substring.
		 * 
		 * String toLowerCase() Converts all of the characters in this String to lower
		 * case using the rules of the default locale.
		 * 
		 * String toUpperCase() Converts all of the characters in this String to upper
		 * case using the rules of the default locale.
		 * 
		 * 
		 * boolean equals(Object anObject) Compares this string to the specified object.
		 * boolean equalsIgnoreCase(String anotherString) Compares this String to
		 * another String, ignoring case considerations.
		 * 
		 */

		/*
		 * GRADED!
		 * 
		 * --looping - "Do you want to enter another word (Y/N)? repeat if Y say
		 *        "Goodbye, see you again" if N 
		 * -- all JOP'd NO syso or Scanner 
		 * -- jar'd up as an executable to run outside of eclipse
		 * -- ask for a string
		 * -- show first char
		 * -- show length
		 * -- show last char
		 * -- show all remaining middle chars
		 */

	}

}
