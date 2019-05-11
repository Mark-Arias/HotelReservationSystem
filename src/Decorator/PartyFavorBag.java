package Decorator;

import Observer.Room;

public class PartyFavorBag extends Upgrades{

    // We need a reference to the obj we are decorating
    Room room;
    protected int quantity;

    public PartyFavorBag(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Party Favor Bag";
    }

    public int getCost(int quantity)
    {

        return 5 * quantity + room.getCost();
    }


}
