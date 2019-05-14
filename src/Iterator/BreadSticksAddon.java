package Iterator;

import MealPlanDecorator.GenericMealPlan;

public class BreadSticksAddon extends MealAddOns{

    GenericMealPlan mealPlan;

    public BreadSticksAddon (GenericMealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }
    public  String getDescription() {
        return mealPlan.getDescription() + ", Bread Sticks ";
    }
//    public  int getCost() {
//        return
//    }
}

