package Factory2;

public class SmallPartyFact extends RoomFactory{
	
	@Override
	public Room createRoom() {
		return new SmallPartyRoom();
	}
}
