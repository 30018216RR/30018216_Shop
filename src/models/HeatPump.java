package models;

/**
 *
 * @author 30018216
 */
public class HeatPump extends Product {
    
    // - - - - - Attributes - - - - -
    private double efficiencyRating;
    
    // - - - - - position - - - - -
    public double efficiencyRating()
    {
    return efficiencyRating;
    }
    
    public void setEfficiencyRating(double efficiencyRatingIn)
    {
       efficiencyRating = efficiencyRatingIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor.
    public HeatPump(){
        super();
        efficiencyRating = 0;
    }
    
    // 4 parameter constructor - everything EXCEPT productId.
    public HeatPump(String productNameIn, double priceIn, int stockLevelIn, double efficiencyRatingIn){
        super(productNameIn, priceIn, stockLevelIn);
        efficiencyRating = efficiencyRatingIn;
    }
    
    // 5 parameter constructor - everything.
    public HeatPump(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, double efficiencyRatingIn){
        super(productIdIn, productNameIn, priceIn, stockLevelIn);
        efficiencyRating = efficiencyRatingIn;
    }
   
    
    // 6 parameter constructor - for assessment 6.
    public HeatPump(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, String productTypeIn, double efficiencyRatingIn){
        super(productIdIn, productNameIn, priceIn, stockLevelIn);
        efficiencyRating = efficiencyRatingIn;
    }
    
}
