package MealPlanDecorator;

public class BronzeMealPlan extends GenericMealPlan{

//    int numberOfLargePizzas;
//    int numberOfLiterSodas;

    double cost;
    double basicMealPlanBaseCost = 75; //$65 + any other charges to the plan (if any)

    public BronzeMealPlan() {
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 5 ;// customer gets 3 large sodas
        this.numberOfToppings = 3;
        this.cost = basicMealPlanBaseCost;

    }
}
