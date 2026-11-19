package models;

import java.util.HashMap;

/**
 *
 * @author 30018216
 */
public class Customer extends User {
    
// 08.10.26 - polymorphism (now that jframes etc are being used).
    public String greeting(){
    String output = "How are you, " + this.getUsername() + "?";
// outputting the car's colour and manufacturer.
    return output;
    }
    
    // - - - - - Attributes - - - - -
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    
    // Assessment stage 3 - new HashMap for orders.
    private HashMap<Integer,Order>orders;
    
    // addressLine1
    public String getAddressLine1()
    {
    return addressLine1;
    }
    
    public void setAddressLine1(String addressLine1In)
    {
       addressLine1 = addressLine1In;
    }
    
    // addressLine2
    public String getAddressLine2()
    {
        return addressLine2;
    }
    
    public void setAddressLine2(String addressLine2In)
    {
       addressLine2 = addressLine2In;
    }
    
    // town
        public String getTown()
    {
        return town;
    }
    
    public void setTown(String townIn)
    {
       town = townIn;
    }
    
    // postcode
    public String getPostcode()
    {
        return postcode;
    }
    
    public void setPostcode(String postcodeIn)
    {
       postcode = postcodeIn;
    }
    
    // isRegistered
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    public void setIsRegistered(boolean isRegisteredIn)
    {
       isRegistered = isRegisteredIn;
    }
    
    // Hashmap of Orders
    public HashMap<Integer,Order>getOrders(){
        return orders;
    }
    
    public void setOrders(HashMap<Integer,Order>ordersIn){
       orders = ordersIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor.
    public Customer(){
        super();
        addressLine1 = "";
        addressLine2 = "";
        town = "";
        postcode = "";
        isRegistered = false;
        orders = new HashMap();
    }
    
    // 8 parameter constructor - everything EXCEPT isRegistered (now 9 parameters - modified to include orders HashMap).
    public Customer(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn, String addressLine1In, String addressLine2In, String townIn, String postcodeIn){
        super(usernameIn, passwordIn, firstNameIn, lastNameIn);
        addressLine1 = addressLine1In;
        addressLine2 = addressLine2In;
        town = townIn;
        postcode = postcodeIn;
        isRegistered = false;
        orders = new HashMap();
    }
    
}
