package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer1 = JOptionPane.showInputDialog("What is Emma's favorite color?");
		if (answer1.equalsIgnoreCase("blue"))  {
			
			score=score+=1;
			JOptionPane.showMessageDialog(null,"How did you know that? That's right!!!");	
				
		}
			// 2.  Ask the user a question 
		String question2 = JOptionPane.showInputDialog("What is better, waffles or pankcakes");
		
		if (question2.equalsIgnoreCase("wafflels"))  {
				
			score=score+=1;
			JOptionPane.showMessageDialog(null,"Of course, waffles are ALWAYS better than panckakes");	
		}
			// 3.  Use an if statement to check if their answer is correct
	
		
		String question3 = JOptionPane.showInputDialog("Did you see bigfoot?");	
		
		if (question3.equalsIgnoreCase("Yes"))  {
			
			score=score+=1;
			JOptionPane.showMessageDialog(null,"Good thing that you have seen big foot.");		
			
		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		// After all the questions have been asked, tell the user their final score 
		
		JOptionPane.showMessageDialog(null,"You got " +score);     
		
	}
}
