package models;

/**
 *
 * @author 30018216
 */
public class SparePart extends Product{
    
//    Extension task - inheritance.
    
    // - - - - - Attributes - - - - -
    private String partFor;
    private int replacementIntervalMonths;
    private boolean installationRequired;
    
    // - - - - - Getters and setters - - - - -
    
    //    partFor
    public String getPartFor(){
        return partFor;
    }
    
    public void setPartFor(String partForIn){
       partFor = partForIn;
    }

    // replacementIntervalMonths
    public int getreplacementIntervalMonths(){
        return replacementIntervalMonths;
    }
    
    public void setreplacementIntervalMonths(int replacementIntervalMonthsIn){
       replacementIntervalMonths = replacementIntervalMonthsIn;
    }

    // installationRequired
    public boolean getinstallationRequired(){
        return installationRequired;
    }
    
    public void setPartFor(boolean installationRequiredIn){
       installationRequired = installationRequiredIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor.
    public SparePart(){
        super();
        partFor = "";
        replacementIntervalMonths = 0;
        installationRequired = false;
    }
    
    // 4 parameters - ALL from Product minus productId, include installationRequired as boolean
    public SparePart(String productNameIn, double priceIn, int stockLevelIn, boolean installationRequiredIn){
        super();
//        partFor = "";
//        replacementIntervalMonths = 0;
        installationRequired = installationRequiredIn;
    }
    
    // Everything EXCEPT productId (from Product) - 6 parameters.
    public SparePart(int productIdIn, String productNameIn, double priceIn, int stockLevelIn, int replacementIntervalMonthsIn, boolean installationRequiredIn){
        super();
//        partFor = "";
        replacementIntervalMonths = replacementIntervalMonthsIn;
        installationRequired = installationRequiredIn;
    }
    
}
