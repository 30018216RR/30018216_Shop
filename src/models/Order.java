package models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 30018216
 */
public class Order {
    
    // - - - - - Attributes - - - - - 
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String orderStatus;
    private HashMap<Integer,OrderLine>orderLines; // HashMap needs to be used as we're dealing with a collection of datatypes.
    
    //    Shop1 things
    public void calculateOrderTotal(){
        orderTotal = 0;
        for(Map.Entry<Integer,OrderLine> olMapEntry : orderLines.entrySet()){
            OrderLine ol = olMapEntry.getValue();
            orderTotal = orderTotal + ol.getLineTotal();
        }
    }
    
// method for generating a unique ID since OrderLine requires this in the Shop(1).
// in order to add an orderline to an order, we have to pass this into the method

    public void addOrderLine(OrderLine ol){

        int orderLineId = 0 ;

        // containsKey is an inbuilt HashMap function
        //this loops through the key and checks to see if it is there already
         while(orderLines.containsKey(orderLineId)){
             orderLineId++;
         }
         ol.setOrderLineId(orderLineId);
         // create setter orderLineId - orderLine class.
         orderLines.put(orderLineId, ol);      
//         this call recalculates the total
              calculateOrderTotal();

    }
    
    // - - - - - Getters & setters - - - - -
    
    public int getOrderId(){
        return orderId;
    }
    
    public Date getOrderDate(){
        return orderDate;
    }

    public double getOrderTotal(){
        return orderTotal;
    }
    
    public String getOrderStatus(){
    return orderStatus;
    }
        
    // assessment 8 - order date.
    public void setOrderDate (Date orderDateIn){
        orderDate = orderDateIn;
    }

    public void setOrderStatus(String statusIn){
        orderStatus = statusIn;
    }
    
    // orderLines HashMap
    public HashMap<Integer,OrderLine>getOrderLines(){
        return orderLines;
    }

    public void setOrderLines(HashMap<Integer,OrderLine>orderLinesIn){
        orderLines = orderLinesIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor
    public Order(){
        orderId = 0;
        orderDate = new Date();
        orderTotal = 0;
        orderStatus = "Ongoing";
        orderLines = new HashMap(); //this MUST be initialised, otherwise it will be null, causing the progam to crash. Needs a starting value, a collection cannot be null.
    }
    
    // 4 parameter constructor minus orderLines which will be a new hashmap.
    public Order(int orderIdIn, Date orderDateIn, double orderTotalIn, String statusIn){
        orderId = orderIdIn;
        orderDate = orderDateIn;
        orderTotal = orderTotalIn;
        orderStatus = statusIn;
        orderLines = new HashMap();
    }
    
}