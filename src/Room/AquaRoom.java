package Room;

public class AquaRoom extends Observer.Room{
	  protected int numberOfRoomsAvailable;
	  protected String description;
	  protected String restrictions;
	  protected double cost;
  
  public AquaRoom() {

	  this.numberOfRoomsAvailable = 1;

	  this.description = "\n\t\tAqua Room"
	  				+ "\n\t\tDescription: Olympic-sized pool with water slide, kiddie pool, and large jacuzzi";
	  
	  this.restrictions ="To access water facilities, bathing suits must be worn at all times";
	  this.cost = 700; 



  }
  
  public String getDescription()
  {
	  String rt = this.description 
			  + "\n\t\tRoom Cost: " + this.cost;
	  return rt;
  }
  
  public void setDescription(String description)
  {
	  this.description = description; 
  }
  
  public double getCost(){
    return cost;
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
	  String rt =  description + "\nCost: " + cost;
	  return rt;
	  
  }
}