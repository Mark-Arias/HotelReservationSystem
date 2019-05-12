package MealPlanDecorator;

public class BronzeMealPlan extends GenericMealPlan{
	


    public BronzeMealPlan() {
    	this.mealPlanName = "Bronze Meal Plan"; 
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 5 ;// customer gets 3 large sodas
        this.numberOfToppings = 2;
        this.cost = 75;

    }
    @Override
	public String getDescription() {
		String rt = "\n\t\t" + this.mealPlanName
				+ "\n\t\t" + this.numberOfLargePizzas + " XL " + this.numberOfToppings + " Topping(s) Gourmet Pizza"
				+ "\n\t\t" + this.numberOfLiterSodas + " 2L Soda Bottles";
			//	+ "\n\t\tCost of meal plan: $" + this.cost;
    	return rt; 
	}
}
