package _03_Intro_to_Enums;

import javax.swing.JOptionPane;

public enum StatesOfMatter {
	SOLID, LIQUID, GAS;

StatesOfMatter[] SOM = new StatesOfMatter[2];{
//SOM[0]=SOLID;
//SOM[1]=LIQUID;
//SOM[2]=GAS;
	String maturr = JOptionPane.showInputDialog(null, "Please anter a state of matter");
}
}