package MealPlanDecorator;

public  class GenericMealPlan {
	
    int numberOfLargePizzas;
    int numberOfToppings;
    int numberOfLiterSodas;
    String mealPlanName;
    String description = "gmp";
    double cost;
    
//    public String getDescription() {
//    	String rt = "\t\tNumber of XL pizzas " + numberOfLargePizzas 
//    				+ "\n\t\tNumber of two liter sodas: " + numberOfLiterSodas;
//    	
//    	return rt;
//    }

	public  String getDescription() {
		return description;
	}
		
}
