package MealPlanDecorator;

public class BreadSticks extends MealUpgrade{
	
	GenericMealPlan mealPlan;
	String description;

    public BreadSticks(GenericMealPlan mealPlan) {
    	
       this.description = "Bread Sticks";
       this.mealPlan = mealPlan;

    }
    

	@Override
	public String getDescription() {
		String rt = mealPlan.getDescription() 
    			//+ "\n\tMeal addon(s) "
    			+ "\n\t\t" + this.description;
		return rt;
	}
}
