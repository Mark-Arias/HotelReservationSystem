package Room;
public class AquaRoom{
  int numberOfRoomsAvailable;
  String restrictions;
  double cost;
  
  public AquaRoom () {
	  
  }
  
  public double getCost(){
    return 700;
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