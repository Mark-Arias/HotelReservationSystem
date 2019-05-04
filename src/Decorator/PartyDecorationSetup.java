package Decorator;

public class PartyDecorationSetup {

    Room room;
    public PartyDecoratorSetup(Room room)
    {
        this.room = room;
    }

    public String getDescription()
    {
        return room.getDescription() + ", Party Decorator Setup";
    }

    public int getCost()
    {
        return 100 + room.getCost();
    }

}
