package MealPlanDecorator;

import java.util.ArrayList;

public class BasicMealPlan extends GenericMealPlan {

    //double cost;
   

    public BasicMealPlan() {
    	this.mealPlanName = "Basic Meal Plan"; 
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 3; // customer gets 3 large sodas

        this.numberOfToppings = 1;

        this.cost = 65;
        pizzaToppingList.add("place");
      
    }

    
//    public String toString() {
//    	//String rt = "Basic Meal Plan\n"+ super.toString() + "\nTotal meal cost: " + cost;
//    	String rt = this.getDescription();
//    	return rt; 
//    	
//    }

	@Override
    public String getDescription() {
		String rt = "\n\t\t" + this.mealPlanName
				+ "\n\t\t" + this.numberOfLargePizzas + " XL " + this.numberOfToppings + " Topping(s) Gourmet Pizza"
				+ "\n\t\t" + this.numberOfLiterSodas + " 2L Soda Bottles";
			//+ "\n\t\tCost of meal plan: $" + this.cost;
		String rt2 = "\n\tTopping Type \n\t\t" + pizzaToppingList.get(1);
    	return rt + rt2; 
	}
	
	
	
	// test method for MainFrame
	public String getDes()
	{
		return "Basic Meal Plan Description";
	}
}
