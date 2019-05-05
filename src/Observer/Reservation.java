package Observer;

import MealPlanDecorator.GenericMealPlan;

import java.util.Date;

/**
 *
 */
public class Reservation
{
    private Date date;
    private int time;
    private Room room;
    private Guest guest;
    private GenericMealPlan mealPlan;
    private boolean isFinalized;
    private String confirmationNumber;
    private String upgrades;
    private String specialInstructions;

    /**
     *
     * @param date
     * @param room
     */
    public Reservation(Date date, Room room, Guest guest)
    {
        this.date = date;
        this.room = room;
        this.guest = guest;
        this.isFinalized = false;
    }


    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }


    /**
     *
     * @return
     */
    public Room getRoom() {
        return room;
    }


    /**
     *
     * @return
     */
    public String getUpgrades(){
        return upgrades;
    }


    /**
     *
     * @return
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }


    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }


    /**
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }


    /**
     *
     * @param m
     */
    public void setMealPlan(GenericMealPlan m){
        mealPlan = m;
    }


    /**
     *
     * @param u
     */
    public void setUpgrades(String u){
        upgrades = u;
    }


    /**
     *
     * @param special
     */
    public void setSpecialInstructions(String special){
        specialInstructions = special;
    }


    /**
     *
     */
    public void finalizeReservation() {
        this.isFinalized = true;
    }
}
