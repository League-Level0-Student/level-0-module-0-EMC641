package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String user = JOptionPane.showInputDialog("Do you know that Emma is Awesome?");
		// 2. If they say "yes", tell them they will rule the world.
		if (user.equalsIgnoreCase("yes")) {
			
			
		// 3. Otherwise, tell them to sign up for classes at The League.
			JOptionPane.showMessageDialog(null,"Emma is awesome");	
			
				
			    
			
		}
			else {
				JOptionPane.showMessageDialog(null,"SAY EMMA IS AWESOME");
			}
	}
}

