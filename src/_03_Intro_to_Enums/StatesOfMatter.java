package _03_Intro_to_Enums;

import java.util.Random;

import javax.swing.JOptionPane;

public enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);

	private double celsiusTemp;

	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	public double convertToFareinheit(double celsiusTemp) {
		return (celsiusTemp * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		System.out.println("length:" + StatesOfMatter.values().length);
		System.out.println(StatesOfMatter.values());
		StatesOfMatter[] SOM = new StatesOfMatter[StatesOfMatter.values().length];
		{
			SOM[0] = SOLID;
			SOM[1] = LIQUID;
			SOM[2] = GAS;

			String s = JOptionPane.showInputDialog(null, "Please enter a state of matter");
			for (int i = 0; i < SOM.length; i++) {
				if (SOM[i].name().equalsIgnoreCase(s)) {
					System.out.println("You chose:" + SOM[i]);
					System.out.println(SOM[i].ordinal());
				} else {

				}
			}
			Random ran = new Random();
			StatesOfMatter state = SOM[ran.nextInt(SOM.length)];
			System.out.println("Random State:" + state.celsiusTemp);
			System.out.println(state.convertToFareinheit(0));
			switch (state) {
			case SOLID:
				System.out.println("Burrito");
				break;
			case LIQUID:
				System.out.println("Smoothie");
				break;
			case GAS:
				System.out.println("Water Vapor");
				break;
			default:
				System.out.println("No State of Matter. :(");
				break;
			}

		}
	}
}