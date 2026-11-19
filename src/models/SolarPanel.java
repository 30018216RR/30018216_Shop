package models;

/**
 *
 * @author 30018216
 */
public class SolarPanel extends Product {
    
    // - - - - - Attributes - - - - -
    private int wattageOutput;
    
    // - - - - - Getters and setters - - - - -
    
    // position
    public int getWattageOutput(){
    return wattageOutput;
    }
    
    public void setWattageOutput(int wattageOutputIn){
//        was called setPosition
       wattageOutput = wattageOutputIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor.
    public SolarPanel(){
        super();
        wattageOutput = 0;
    }
    
    // 4 parameter constructor - everything EXCEPT productId.
    public SolarPanel(String productNameIn, double priceIn, int stockLevelIn, int wattageOutputIn){
        super(productNameIn, priceIn, stockLevelIn);
        wattageOutput = wattageOutputIn;
    }
    
    // 5 parameter constructor - everything.
    public SolarPanel(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, int wattageOutputIn){
        super(productIdIn, productNameIn, priceIn, stockLevelIn);
        wattageOutput = wattageOutputIn;
    }
    
        // 5 parameter constructor - everything.
    public SolarPanel(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, String productTypeIn, int wattageOutputIn){
        super(productIdIn, productNameIn, priceIn, stockLevelIn);
        wattageOutput = wattageOutputIn;
    }
    
}
