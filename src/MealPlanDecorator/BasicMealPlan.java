package MealPlanDecorator;

public class BasicMealPlan extends GenericMealPlan {

    int numberOfLargePizzas;
    int numberOfLiterSodas;

    double cost;
   

    public BasicMealPlan() {
    	
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 3; // customer gets 3 large sodas

        this.numberOfToppings = 1;

        this.cost = 65;
    }
    
    public String toString() {
    	String rt = "Number of XL pizzas " + numberOfLargePizzas 
    				+ "\nNumber of two liter sodas: " + numberOfLiterSodas;
    	
    	return rt;
    }
}
