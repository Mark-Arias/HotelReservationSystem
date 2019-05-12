package MealPlanDecorator;

import java.util.ArrayList;

public class GoldMealPlan extends GenericMealPlan {


	ArrayList<String> chickWingFlavorList= new ArrayList<String>();
	
	boolean boneless = true;
    double cost;
    double basicMealPlanBaseCost = 120; //$65 + any other charges to the plan (if any)

    /**
     * Gold Meal Plan
     */
    public GoldMealPlan() {
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 5; // number of 2L sodas

        this.numberOfToppings = 3; // 3 toppings available for the pizza
        this.cost = 120;
    }
    
	@Override
    public String getDescription() {
		String rt = "\n\t\t" + this.mealPlanName
				+ "\n\t\t" + this.numberOfLargePizzas + " XL " + this.numberOfToppings + " Topping(s) Gourmet Pizza"
				+ "\n\t\t" + this.numberOfLiterSodas + " 2L Soda Bottles";
			//+ "\n\t\tCost of meal plan: $" + this.cost;
		String rt2 = "\n\tTopping Type \n\t\t" + pizzaToppingList.get(1);
    	return rt + rt2; 
	}
}
