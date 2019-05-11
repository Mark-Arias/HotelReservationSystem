package MealPlanDecorator;

public class GenericMealPlan extends Decorator.Upgrades{
    int numberOfLargePizzas;
    int numberOfToppings;
    int numberOfLiterSodas;
    double cost;
    
    public String toString() {
    	String rt = "Number of XL pizzas " + numberOfLargePizzas 
    				+ "\nNumber of two liter sodas: " + numberOfLiterSodas;
    	
    	return rt;
    }
}
