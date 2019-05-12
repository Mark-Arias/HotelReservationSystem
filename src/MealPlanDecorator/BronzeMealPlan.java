package MealPlanDecorator;

public class BronzeMealPlan extends GenericMealPlan{
	


    public BronzeMealPlan() {
    	this.mealPlanName = "Bronze Meal Plan"; 
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 5 ;// customer gets 3 large sodas
        this.numberOfToppings = 2;
        this.cost = 75;

    }
    
//    public String toString() {
//    	String rt = super.toString() + "\nTotal room cost: " + cost;
//    	return rt; 
//    	
//    }
}
