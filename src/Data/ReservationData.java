package Data;
import java.util.ArrayList;
import Observer.Reservation;
public class ReservationData {
	//stores the data for the entire reservation in a arraylist of reservations
	
	ArrayList <Reservation> reservationData;
	
	
	ReservationData() {
		
		reservationData = new ArrayList<Reservation>();
		
	}
	public void addReservation (Reservation reservation) {
		reservationData.add(reservation);
	}
	
	public ArrayList<Reservation> getReservationData () {
		return this.reservationData;
	}
	
}