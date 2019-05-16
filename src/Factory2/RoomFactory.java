package Factory2;

public abstract class RoomFactory {
	static final int MAX_SMALL = 10;
	static final int MAX_MEDIUM = 2;
	static final int MAX_KARAOKE = 10;
	static final int MAX_BILLLIARDS = 5;
	
	
	public abstract Room createRoom();
}
