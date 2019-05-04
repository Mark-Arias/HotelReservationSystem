package Date;

public class date {
	private int month;
	private int day;
	private int year;

	public date(int month, int day, int year) {
		this.setMonth(0);
		this.setDay(0);
		this.setYear(0);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	

}
