package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Cori = "Cori has the avengers as chickens";
String Ava = "Ava swimms at a swimming pool";
String Danica = "Danica has a dog nameed summer she is scared of every thing and is veary atached to Danicas mom";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String choose = JOptionPane.showInputDialog(null, "Who do you choose?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(choose.equals("Cori")) {

	JOptionPane.showMessageDialog(null, "Cori has the avengers as chickens");
}

if(choose.equals("Ava")) {
	
	JOptionPane.showMessageDialog(null, "Ava swimms at a swimming pool");
}
if(choose.equals("Danica")){
	
	JOptionPane.showMessageDialog(null,"Danica has a dog named summer she is scared of every thing and is veary atached to Danicas mom");
	
}	
	
}



}








	
	
	


