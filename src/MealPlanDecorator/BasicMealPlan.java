package MealPlanDecorator;

public class BasicMealPlan extends GenericMealPlan {

    double cost;
   

    public BasicMealPlan() {
    	
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 3; // customer gets 3 large sodas

        this.numberOfToppings = 1;

        this.cost = 65;
    }
    
    public String toString() {
    	String rt = super.toString() + "\nTotal room cost: " + cost;
    	return rt; 
    	
    }
}
