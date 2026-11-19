package models;

/**
 *
 * @author 30018216
 */
public class Product {
    
    // - - - - - Attributes - - - - -
    private int productId;
    private String productName;
    private double price;
    private int stockLevel;
    private String productType; // added for assessment 6.
    
    // - - - - - Getters & Setters - - - - -
    
    
    // productId
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productIdIn){
        productId = productIdIn;
    }
    
    // productName
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productNameIn){
        productName = productNameIn;
    }
    
    // price
    public double getPrice(){
        return price;
    }
    public void setPrice(double priceIn){
        price = priceIn;
    }
    
    // stockLevel
    public int getStockLevel(){
        return stockLevel;
    }
    public void setStockLevel(int stockLevelIn){
        stockLevel = stockLevelIn;
    }
    
    // productType (assessment 6)
    public String getProductType(){
        return productType;
    }
    public void setProductType(String productTypeIn){
        productType = productTypeIn;
    }
    
        // Assessment 6
    // method which allows the info in the db to be output as string in the Shop view.
    @Override //this overrides in order to show the object as string.
    // so every time we want a Product to be shown, this gets run.
    public String toString(){
//        String output = productName + " - " + productType;
        String output = productName;
        return output;
    }
    
    // - - - - - Constructors - - - - -
    
    // 0 parameter constructor.
    public Product(){
        productId = 0;
        productName = "";
        price = 0;
        stockLevel = 0;
        productType = "";
    }
    
    // 3 parameter constructor - everything EXCEPT productId
        public Product(String productNameIn, double priceIn, int stockLevelIn){
        productId = 0; //Loading in default value even though attribute is not being used in this constructor.
        productName = productNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
    }
        
    // 4 parameter constructor - everything.
        public Product(int productIdIn, String productNameIn, double priceIn, int stockLevelIn){
        productId = productIdIn;
        productName = productNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
    }
        
    // 5 parameter constructor for assessment 6
        public Product(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, String productTypeIn){
        productId = productIdIn;
        productName = productNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
        productType = productTypeIn;
    }
}
