package Iterator;

public class BasicMealPlan extends GenericMealPlan {

    int numberOfLargePizzas;
    int numberOfLiterSodas;

    double cost;
    double basicMealPlanBaseCost = 65; //$65 + any other charges to the plan (if any)

    public BasicMealPlan() {
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 3; // customer gets 3 large sodas

        this.numberOfToppings = 1;

        this.cost = basicMealPlanBaseCost;
    }

}
