package Decorator;

import Observer.Room;

public class Projector {

    Room room;
    protected int hour;

    public Projector(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Projector";
    }

    public int getCost(int hour)
    {
        return 10 * hour + room.getCost();
    }
}
