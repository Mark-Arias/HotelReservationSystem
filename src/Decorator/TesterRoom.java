package Decorator;

import MealPlanDecorator.BasicMealPlan;

import MealPlanDecorator.BronzeMealPlan;
import Observer.Reservation;
import Observer.Room;

import Room.AquaRoom;
import Room.SmallPartyRoom;

public class TesterRoom {

	public static void main(String[] args) {
		// test aquaRoom
		AquaRoom aRoom1 = new AquaRoom();
		SmallPartyRoom sRoom1 = new SmallPartyRoom();
		//System.out.println(aRoom1.toString());
		//System.out.println();
		
		BasicMealPlan bmp = new BasicMealPlan();
		BronzeMealPlan bznmp = new BronzeMealPlan();
		//System.out.println(bmp.toString());
		//System.out.println();
		
		Reservation johnsons = new Reservation(aRoom1, bmp);
		Reservation smiths = new Reservation(sRoom1, bznmp);
		
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
		
		System.out.println("The Johnson's reservation number is: " + johnsons.getReservationNumber());
		
		
		
		
		
		//String amenities, int capacity, boolean isAvailable
		//AquaRoom aRoom2 = new AquaRoom();
		
		//decorate it 
		//aRoom2 = new TowelRental(aRoom2); 
		// 

		//Room room1 = new Room("", 2, true);
		//room1 = new TowelRental(room1); 
		
		//System.out.println(room1.getDescription()); 
		
		

		//Room room1 = new Room("", 2, true);
		//room1 = new TowelRental(room1); 

			
	}
}
