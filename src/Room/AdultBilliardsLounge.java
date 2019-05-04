package Room;
public class AdultBilliardsLounge {
  int numberOfRoomsAvailable;
  String restrictions;
  double cost;
  
	  public double getCost(){
		  return 25;
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
