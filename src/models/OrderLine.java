package models;

/**
 *
 * @author 30018216
 */
public class OrderLine {
    
// - - - - - Attributes - - - - -
    private int orderLineId;
    private Product productBought;
    private int quantity;
    private double lineTotal;
    
    // - - - - - Getters and setters - - - - -
    
        // getters & setters

 // orderLineId
    public int getOrderLineId(){
        return orderLineId;
    }
    public void setOrderLineId(int orderLineIdIn){
        orderLineId = orderLineIdIn;
    }
    
    // product
    public Product getProductBought(){
        return productBought;
    }
    public void setProductBought(Product productIn){
        productBought = productIn;
    }
    
    // quantity
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantityIn){
        quantity = quantityIn;
    }
    
    //lineTotal
    public double getLineTotal(){
    return lineTotal;
    }
    
    // lineTotal
    public double setLineTotal(){
        return lineTotal;
    }
    public void setLineTotal(double lineTotalIn){
        lineTotal = lineTotalIn;
    }
    
    // - - - - - Constructors - - - - -
    
    // 0 parameter constructor
        public OrderLine(){
        orderLineId = 0;
        productBought = new Product();
        quantity = 0;
        lineTotal = 0;
    }
        
    // Constructor for all attributes - lineTotal calculated by multiplying product price (getPrice method in Product class) by quantity
    public OrderLine(int orderLineIdIn, Product productIn, int quantityIn){
        orderLineId = orderLineIdIn;
        productBought = productIn;
        quantity = quantityIn;
        lineTotal = productIn.getPrice() * quantityIn;
    }
    
        public OrderLine(Product productIn){
        orderLineId = 0;
        productBought = productIn;
        lineTotal = productBought.getPrice();
    }
    
}
