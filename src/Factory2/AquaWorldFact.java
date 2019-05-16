package Factory2;

public class AquaWorldFact extends RoomFactory {
	
	@Override
	public Room createRoom() {
		return new AquaWorldRoom();
	}
}
