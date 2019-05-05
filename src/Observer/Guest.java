package Observer;

/**
 *
 */
public class Guest
{

    private String name;
    private int phone;
    private String email;
    private String address;
    private int creditCardInfo;


    /**
     *
     * @param n
     */
    public void setName(String n){
        name = n;
    }


    /**
     *
     * @param p
     */
    public void setPhone(int p){
        phone = p;
    }


    /**
     *
     * @param e
     */
    public void setEmail(String e){
        email = e;
    }


    /**
     *
     * @param a
     */
    public void setAddress(String a){
        address = a;
    }


    /**
     *
     * @param c
     */
    public void setCreditCardInfo(int c){
        creditCardInfo = c;
    }


    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }


    /**
     *
     * @return
     */
    public int getPhone(){
        return phone;
    }


    /**
     *
     * @return
     */
    public String getEmail(){
        return email;
    }


    /**
     *
     * @return
     */
    public String getAddress(){
        return address;
    }


    /**
     *
     * @return
     */
    public int getCreditCardInfo(){
        return creditCardInfo;
    }
}
