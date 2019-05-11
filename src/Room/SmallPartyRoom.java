package Room;

public class SmallPartyRoom{
  int numberOfRoomsAvailable;
  String description;
  String restrictions;
  double cost;
	  
  public SmallPartyRoom()
  {
	  this.numberOfRoomsAvailable = 3;
	  this.description = "";
	  this.restrictions = "";
	  this.cost = 5.00; 
  }
  public double getCost(){
	  return cost;
  }
  
  public String getRestrictions() {
	  return restrictions;
  }
  
  public String getDescription()
  {
	  return description;
  }
  
  
  public void setDescription(String description)
  {
	  this.description = description;
  }
  
  public void setCost(double cost) {
	  this.cost = cost;
  }
  
  public void setRestrictions(String restrictions) {
	  this.restrictions = restrictions;
  }
}
