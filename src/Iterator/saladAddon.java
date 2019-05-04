package Iterator;

public class saladAddon extends MealAddOns {
    GenericMealPlan mealPlan;

    public saladAddon (GenericMealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }
    public  String getDescription() {
        return mealPlan.getDescription() + ", salad ";
    }
//    public  int getCost() {
//        return
//    }
}
