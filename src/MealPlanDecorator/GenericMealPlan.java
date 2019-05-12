package MealPlanDecorator;

import java.util.*;

public  class GenericMealPlan {
	
    int numberOfLargePizzas;
    int numberOfToppings;
    int numberOfLiterSodas;
    
    ArrayList <String> pizzaToppingList = new ArrayList<String>();
    ArrayList <String> sodaTypeList = new ArrayList<String>();
    
    String mealPlanName;
    String description = "gmp";
    double cost;
    
//    public String getDescription() {
//    	String rt = "\t\tNumber of XL pizzas " + numberOfLargePizzas 
//    				+ "\n\t\tNumber of two liter sodas: " + numberOfLiterSodas;
//    	
//    	return rt;
//    }
    public void setTopping(String topping) {
    	pizzaToppingList.add(topping);
    }
    
    public ArrayList<String> getToppingList() {
    	return this.pizzaToppingList;
    }
    
    public void addSodaType(String soda) {
    	sodaTypeList.add(soda);
    }
    
    public ArrayList<String> getSodaTypeList() {
    	return this.sodaTypeList;
    }
	public  String getDescription() {
		return description;
	}
		
}
