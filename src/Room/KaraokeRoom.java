package Room;
public class KaraokeRoom {
  int numberOfRoomsAvailable;
  String restrictions;
  double cost;
  
	  public double getCost(){
	    return 30;
	  }
	  
	  public String getRestrictions() {
		  return restrictions;
	  }
	  
	  public void setCost(double cost) {
		  this.cost = cost;
	  }
	  
	  public void getRestrictions(String restrictions) {
		  this.restrictions = restrictions;
	  }
	  
	  
}
