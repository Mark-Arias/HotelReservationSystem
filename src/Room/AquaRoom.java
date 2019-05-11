package Room;
public class AquaRoom{
  protected int numberOfRoomsAvailable;
  protected String description;
  protected String restrictions;
  protected double cost;
  
  public AquaRoom() {
	  
	  this.numberOfRoomsAvailable = 1;

	  this.description = "Olympic-sized pool with water slide, kiddie pool, and large jacuzzi";
	  this.restrictions ="To access water facilities, bathing suits must be worn at all times";
	  this.cost = 700; 

<<<<<<< HEAD

=======
	  this.description = "";
>>>>>>> branch 'master' of https://github.com/Mark-Arias/HotelReservationSystem.git

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
	  String rt = "Room Ammenities" + description + "\nCost: " + cost;
	  return rt;
	  
  }
}