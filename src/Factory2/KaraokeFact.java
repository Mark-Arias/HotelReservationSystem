package Factory2;

public class KaraokeFact extends RoomFactory{

	@Override
	public Room createRoom() {
		return new KaraokeRoom();
	}
}
