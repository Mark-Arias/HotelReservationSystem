package Decorator;

import MealPlanDecorator.IceCreamAddon;
import MealPlanDecorator.BasicMealPlan;
import MealPlanDecorator.BreadSticks;
import MealPlanDecorator.BronzeMealPlan;
import MealPlanDecorator.GenericMealPlan;
import MealPlanDecorator.GoldMealPlan;
import MealPlanDecorator.Salad;
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
		
		GenericMealPlan bmp = new BasicMealPlan();
		GenericMealPlan bmp2 = new BronzeMealPlan();
		GenericMealPlan bmp3 = new BronzeMealPlan();
		GenericMealPlan bznmp = new BronzeMealPlan();
		GenericMealPlan gldmp = new GoldMealPlan();
		
		bmp.setTopping("peppers");
		//adding salad to a bronze plan
		bznmp = new Salad(bznmp); 
		//adding bread sticks to the bronze plan
		bznmp = new BreadSticks(bznmp); 
		
		bmp2 = new Salad(bmp2);
		bmp2 = new IceCreamAddon(bmp2);
	
		bmp3 = new IceCreamAddon(bmp2);
		bmp3.setTopping("peppers");
		bmp3.setTopping("onions");
		
		Reservation johnsons = new Reservation(aRoom1, bmp);
		Reservation smiths = new Reservation(sRoom1, bznmp);

		Reservation starks = new Reservation(aRoom1, bmp2);
		Reservation snows = new Reservation(sRoom1, gldmp);
		
	
		System.out.println(johnsons.toString());
		System.out.println();
		
		System.out.println(smiths.toString());
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
