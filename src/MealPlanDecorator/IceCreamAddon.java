package MealPlanDecorator;

public class IceCreamAddon extends MealUpgrade{
	
	GenericMealPlan mealPlan;
	String description;
	String flavors; //chocolate, vanilla, and/or strawberry

    public IceCreamAddon(GenericMealPlan mealPlan) {
    	
       this.description = "Ice Cream";
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
