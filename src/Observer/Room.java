package Observer;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class Room
{

    private String amenities;
    private boolean isAvailable;
    private String description;
    private int capacity;
    private double cost;
    private ArrayList<Reservation> reservationArrayList;


    /**
     * Room Constructor
     */
    public Room(String amenities, int capacity, boolean isAvailable)
    {
        this.amenities = amenities;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }


    /**
     *
     * @return
     */
    public String getAmenities() {
        return amenities;
    }


    /**
     *
     * @param upgrade
     */
    public void upgradeAmenities(String upgrade) {
        this.amenities.concat(upgrade);
    }


    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     *
     * @return
     */
    public boolean reserve()
    {
        return true;
    }


    /**
     *
     */
    public void makeAvailable()
    {

    }


    /**
     *
     * @return
     */
    public double getCost(){
        return cost;
    }

    /**
    *
    * @return
    */
   public double getDescription(){
       return cost;
   }

    // Methods below associated with Observer Design Pattern -------------------------------------------------------

    /**
     *
     * @param requestedReservation
     */
    public void addToWaitList(Reservation requestedReservation)
    {
        reservationArrayList.add(requestedReservation);
    }


    /**
     *
     * @param requestedReservation
     */
    public void removeFromWaitList(Reservation requestedReservation)
    {
        reservationArrayList.remove(requestedReservation);
    }


    /**
     *
     */
    public void contactGuest()
    {

    }


    /**
     *
     * @param dateRequested
     * @return
     */
    public boolean isAvailable(Date dateRequested)
    {
        return true;
    }



}
