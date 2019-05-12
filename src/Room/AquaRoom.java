package Room;
public class AquaRoom extends Observer.Room{
  protected int numberOfRoomsAvailable;
  protected String description;
  protected String restrictions;
  protected double cost;
  
  public AquaRoom() {
	  //super(capacity, isAvailable);
	  //String amenities, int capacity, boolean isAvailable
	  this.numberOfRoomsAvailable = 1;

	  this.description = "Aqua Room" +  ""
	  				+ "\n\tOlympic-sized pool with water slide, kiddie pool, and large jacuzzi";
	  
	  this.restrictions ="To access water facilities, bathing suits must be worn at all times";
	  this.cost = 700; 



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