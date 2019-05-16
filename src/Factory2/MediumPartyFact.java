package Factory2;

public class MediumPartyFact extends RoomFactory{
	
	@Override
	public Room createRoom() {
		return new MediumPartyRoom();
	}
}
