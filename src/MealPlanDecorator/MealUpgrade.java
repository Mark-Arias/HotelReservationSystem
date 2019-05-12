package MealPlanDecorator;

public abstract class MealUpgrade extends GenericMealPlan{
	
	String description;


    
//    public String toString() {
//    	String rt = super.toString() + "\nTotal room cost: " + cost;
//    	return rt; 
//    	
//    }

	@Override
	public abstract String getDescription();
}
