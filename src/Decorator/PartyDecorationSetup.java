package Decorator;

import Observer.Room;

public class PartyDecorationSetup extends Upgrades{

    Room room;
    public PartyDecorationSetup(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Party Decorator Setup";
    }

    public double getCost()
    {
        return 100 + room.getCost();
    }


}
