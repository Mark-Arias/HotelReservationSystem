package Iterator;

public class ChickenWingsAddon extends MealAddOns{
    String [] chickenFlavors = new String [6]; //flavors available (6) : spicy, mild, lemon-pepper, BBQ, Seasame, or diablo

    String chickenFlavor1;
    String chickenFlavor2;

    boolean bonesWanted = false; // default set to boneless wings

    GenericMealPlan mealPlan;

    public ChickenWingsAddon (GenericMealPlan mealPlan) {
        this.mealPlan = mealPlan;
        chickenFlavors[0] ="Spicy";
        chickenFlavors[1] ="Mild";
        chickenFlavors[2] ="Lemon Pepper";
        chickenFlavors[3] ="BBQ";
        chickenFlavors[4] ="Seasame";
        chickenFlavors[5] ="Diablo";

    }
    public String getDescription() {
        return mealPlan.getDescription() + ", Chicken Wings Flavors: " + chickenFlavor1 + " and " + chickenFlavor2;

    }

    /**
     * sets the flavors for the chicken object. two flavors should be selected from a drop down menu. An int
     * pair should be passed to this method. the int pair points to the flavor string within an arrary.
     * 0 for spicy, 1 for mild, 2 for lemon pepper, 3 for bbq, 4 for seasame, 5 for diablo.
     *
     * @param flavor1, flavor2
     */
    public void setFlavor(int flavor1, int flavor2) {

        //sets the flavor into a variable. Each flavor with an individual variable.

        chickenFlavor1 = chickenFlavors[flavor1];
        chickenFlavor2 = chickenFlavors[flavor2];
    }

    pubic String [] getFlavor () {
        String [] CFs = new String[2];
        return
    }
//    public  int getCost() {
//        return
//    }



}
