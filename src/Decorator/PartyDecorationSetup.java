package Decorator;

import Observer.Room;

public class PartyDecorationSetup extends Upgrades{

	// Instance variable room of type room 
    Room room;
    
    // Constructor 
    public PartyDecorationSetup(Room room)
    {
        this.room = room;
    }

    // Add to the description 
    public String getDescription()
    {
        return room.getDescription() + ", Party Decorator Setup";
    }

    // Adjust cost accordingly 
    public double getCost()
    {
        return 100 + room.getCost();
    }


}
