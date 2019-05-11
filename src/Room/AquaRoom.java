package Room;
public class AquaRoom{
  protected int numberOfRoomsAvailable;
  protected String description;
  protected String restrictions;
  protected double cost;
  
  public AquaRoom () {
	  
	  this.numberOfRoomsAvailable = 1;
	  this.description = "";
	  
  }
  
  public String getDescription()
  {
	  return this.description;
  }
  
  public void setDescription(String description)
  {
	  this.description = description; 
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
  
  public String toString() {
	  String rt = "Room Ammenities" + description + "\nCost: " + cost;
	  return rt;
	  
  }
}