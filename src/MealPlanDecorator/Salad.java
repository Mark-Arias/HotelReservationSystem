package MealPlanDecorator;

public class Salad extends MealUpgrade{
	
	

    public Salad() {
    	
       this.description = "Salad";

    }
    
    public String toString() {
    	String rt = super.toString() 
    			+ "\n\tMeal addon(s) "
    			+ "\n\t" + description;
    	return rt; 
    	
    }

	@Override
	public String getDescription() {
		String rt = super.toString() 
    			+ "\n\tMeal addon(s) "
    			+ "\n\t" + description;
		return rt;
	}
}
