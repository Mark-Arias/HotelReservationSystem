package Factory2;

public class AdultBilliardsFact extends RoomFactory {
	@Override
	public Room createRoom() {
		return new AdultBilliardsRoom();
	}
}
