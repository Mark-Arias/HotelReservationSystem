package Decorator;

import Observer.Room;

public class PartyFavorBag extends Upgrades{

    // We need a reference to the obj we are decorating
	// Instance variable room of type room 
    Room room;
    protected int quantity;

    public PartyFavorBag(Room room)
    {
        this.room = room;
    }

    // Add to the description 
    public String getDescription()
    {
        return room.getDescription() + ", Party Favor Bag";
    }


    // Adjust cost accordingly 
    // Take in quantity 
    public double getCost(int quantity)
    {

        return 5 * quantity + room.getCost();
    }


}
