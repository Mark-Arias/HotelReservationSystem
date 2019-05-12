package MealPlanDecorator;

public abstract class GenericMealPlan {
    int numberOfLargePizzas;
    int numberOfToppings;
    int numberOfLiterSodas;
    double cost;
    
    public String toString() {
    	String rt = "\tNumber of XL pizzas " + numberOfLargePizzas 
    				+ "\n\tNumber of two liter sodas: " + numberOfLiterSodas;
    	
    	return rt;
    }

    public abstract String getDescription();
}
