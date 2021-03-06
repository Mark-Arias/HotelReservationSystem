package MealPlanDecorator;

public class Salad extends MealUpgrade{
	
	GenericMealPlan mealPlan;
	String description;

    public Salad(GenericMealPlan mealPlan) {
    	
       this.description = "Salad";
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
