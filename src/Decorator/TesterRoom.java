package Decorator;

import MealPlanDecorator.BasicMealPlan;
import Room.AquaRoom;

public class TesterRoom {

	public static void main(String[] args) {
		// test aquaRoom
		AquaRoom aRoom1 = new AquaRoom();
		
		System.out.println(aRoom1.toString());

		BasicMealPlan bmp = new BasicMealPlan();
		

		System.out.println(bmp.toString());

	}
}
