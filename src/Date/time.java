package Date;

public class time {
	private int hour;
	private int minute;

	public time(int hour, int minute) {
		this.hour = 0;
		this.minute = (0);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public String toString() {
		return hour + ":" + minute;
	}
}
