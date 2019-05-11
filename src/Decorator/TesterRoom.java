package Decorator;

import MealPlanDecorator.BasicMealPlan;

import MealPlanDecorator.BronzeMealPlan;

import Observer.Room;

import Room.AquaRoom;

public class TesterRoom {

	public static void main(String[] args) {
		// test aquaRoom
		AquaRoom aRoom1 = new AquaRoom();
		System.out.println(aRoom1.toString());

		BasicMealPlan bmp = new BasicMealPlan();
		System.out.println(bmp.toString());
		
		BronzeMealPlan bznmp = new BronzeMealPlan();
		System.out.println(bznmp.toString());
		

		AquaRoom aRoom2 = new AquaRoom();
		
		//decorate it 
		aRoom2 = new TowelRental(aRoom2); 
		// 
		Room room1 = new Room("", 2, true);
		room1 = new TowelRental(room1); 
			
	}
}
