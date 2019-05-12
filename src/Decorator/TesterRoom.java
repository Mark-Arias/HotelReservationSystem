package Decorator;

import MealPlanDecorator.BasicMealPlan;

import MealPlanDecorator.BronzeMealPlan;
import Observer.Reservation;
import Observer.Room;

import Room.AquaRoom;

public class TesterRoom {

	public static void main(String[] args) {
		// test aquaRoom
		AquaRoom aRoom1 = new AquaRoom();
		//System.out.println(aRoom1.toString());
		//System.out.println();
		
		BasicMealPlan bmp = new BasicMealPlan();
		//System.out.println(bmp.toString());
		//System.out.println();
		
		Reservation johnsons = new Reservation(aRoom1, bmp);
		Reservation smiths = new Reservation(aRoom1, bmp);
		Reservation kens = new Reservation(aRoom1, bmp);
		Reservation starks = new Reservation(aRoom1, bmp);
		Reservation snows = new Reservation(aRoom1, bmp);
		
	
		System.out.println(johnsons.toString());
		System.out.println();
		
		System.out.println(smiths.toString());
		System.out.println();
		
		System.out.println(kens.toString());
		System.out.println();
		
		System.out.println(starks.toString());
		System.out.println();
		
		System.out.println(snows.toString());
		System.out.println();
		
		System.out.println(johnsons.getReservationNumber());
		
		
		
		
		
		//String amenities, int capacity, boolean isAvailable
		//AquaRoom aRoom2 = new AquaRoom();
		
		//decorate it 
		//aRoom2 = new TowelRental(aRoom2); 
		// 
		//Room room1 = new Room("", 2, true);
		//room1 = new TowelRental(room1); 
			
	}
}
