package MealPlanDecorator;

public class IceCreamAddon extends MealUpgrade{
	
	GenericMealPlan mealPlan;
	String description;
	String flavor1 = "chocolate"; //chocolate, vanilla, and/or strawberry
	String flavor2="vanilla";
	
    public IceCreamAddon(GenericMealPlan mealPlan) {
    	
       this.description = "Ice Cream";
       this.mealPlan = mealPlan;

    }
    public String getFlavor1() {
    	return flavor1;
    }
    public String getFlavor2() {
    	return flavor2;
    }
    public void setFlavor1(String flavor) {
    	this.flavor1 = flavor;
    	
    }
    public void setFlavor2(String flavor) {
    	this.flavor2 = flavor;
    	
    }

	@Override
	public String getDescription() {
		String rt = mealPlan.getDescription() 
    			//+ "\n\tMeal addon(s) "
    			+ "\n\t\t" + this.description + " Flavors: " + this.flavor1 + " and " + this.flavor2;
		
		return rt;
	}
}
