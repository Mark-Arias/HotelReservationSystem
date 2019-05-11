package Decorator;

import Observer.Room;

public class TowelRental extends Upgrades {

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

    public double getCost()
    {
    	
        return 2 * quantity + room.getCost();
    }
}

