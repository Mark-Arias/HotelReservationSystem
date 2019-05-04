package Iterator;

public class GoldMealPlan extends GenericMealPlan {

    //    int numberOfLargePizzas;
//    int numberOfLiterSodas;

    double cost;
    double basicMealPlanBaseCost = 120; //$65 + any other charges to the plan (if any)

    public GoldMealPlan() {
        this.numberOfLargePizzas = 3 ;// 3 XL pizzas with one toppings
        this.numberOfLiterSodas = 5; // number of 2L sodas

        this.numberOfToppings = 3; // 3 toppings available for the pizza
        this.cost = basicMealPlanBaseCost;
    }

}
