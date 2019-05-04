package Decorator;

public class TowelRental extends Upgrades {

    Room room;
    protected int quantity;

    public Projector(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Projector";
    }

    public int getCost()
    {
        return 2(quantity) + room.getCost();
    }
}
}
