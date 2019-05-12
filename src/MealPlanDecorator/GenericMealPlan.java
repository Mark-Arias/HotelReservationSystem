package MealPlanDecorator;

public  class GenericMealPlan {
    int numberOfLargePizzas;
    int numberOfToppings;
    int numberOfLiterSodas;
    String mealPlanName;
    String description;
    double cost;
    
    public String toString() {
    	String rt = "\t\tNumber of XL pizzas " + numberOfLargePizzas 
    				+ "\n\t\tNumber of two liter sodas: " + numberOfLiterSodas;
    	
    	return rt;
    }

	public String getDescription() {
		String rt = "\n\t\t" + this.mealPlanName
				+ "\n\t\t" + this.numberOfLargePizzas + " XL " + this.numberOfToppings + " Topping(s) Gourmet Pizza"
				+ "\n\t\t" + this.numberOfLiterSodas + " 2L Soda Bottles"
				+ "\n\t\tCost of meal plan: $" + this.cost;
    	return rt; 
	}
}
