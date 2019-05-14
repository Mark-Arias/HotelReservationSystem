package Room;

public class SmallPartyRoom extends Observer.Room{
	  protected int numberOfRoomsAvailable;
	  protected String description =  "\n\t\tSmall Party Room"
	  			+ "\n\t\tDescription: Room with party tables and chairs, adjacent to arcade.";;
	  protected String restrictions;
	  protected double cost;
	  
	  public SmallPartyRoom()
	  {
		  this.numberOfRoomsAvailable = 3;
		  
//		  this.description = "\n\t\tSmall Party Room"
//				  			+ "\n\t\tDescription: Room with party tables and chairs, adjacent to arcade.";
		  
		  this.restrictions = "";
		  
		  this.cost = 150; //$150 / hr 
	  }
	  
	  public double getCost(){
		  return cost;
	  }
	  
	  public String getRestrictions() {
		  return restrictions;
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
	  
	  public void setCost(double cost) {
		  this.cost = cost;
	  }
	  
	  public void setRestrictions(String restrictions) {
		  this.restrictions = restrictions;
	  }
}
