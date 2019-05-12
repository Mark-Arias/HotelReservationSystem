package Decorator;

import Observer.Room;

public class TowelRental extends Upgrades {

	// Instance variable room of type room 
    Room room;
    protected int quantity;

    public TowelRental(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Towel Rental";
    }

    // Adjust cost accordingly 
    public double getCost()
    {
    	
        return 2 * quantity + room.getCost();
    }
}

