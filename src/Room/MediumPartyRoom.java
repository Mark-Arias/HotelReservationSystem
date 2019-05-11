package Room;
public class MediumPartyRoom {
	
  int numberOfRoomsAvailable;
  String description;
  String restrictions;
  double cost;
  
  public MediumPartyRoom()
  {
	  
  }
  public double getCost(){
	  return 250;
  }
  
  public String getRestrictions() {
	  return restrictions;
  }
  
  public String getDescription()
  {
	  return description;
  }
  
  public void setCost(double cost) {
	  this.cost = cost;
  }
  
  public void setRestrictions(String restrictions) {
	  this.restrictions = restrictions;
  }
  
  public void setDescription(String description)
  {
	  this.description = description; 
  }
  
}
