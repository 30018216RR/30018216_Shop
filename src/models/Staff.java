package models;

/**
 *
 * @author 30018216
 */
public class Staff extends User {
    
    // 22.10.26 - polymorphism (now that jframes etc are being used).
    public String greeting(){
    String output = "Hello, " + this.getUsername() + " !";
// outputting the car's colour and manufacturer.
    return output;
    }
    
    // - - - - - Attributes - - - - -
    private String position;
    private double salary;
    
    // - - - - - position - - - - -
        public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String positionIn)
    {
       position = positionIn;
    }
    
    // - - - - - salary - - - - -
        public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double salaryIn)
    {
       salary = salaryIn;
    }
    
    // - - - - - Constructors - - - - -
    // 0 parameter constructor.
    public Staff(){
        super();
        position = "";
        salary = 0;
    }
    
    // 6 parameter constructor - 4 variables from User, and 2 from this class.
    public Staff(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn, String positionIn, double salaryIn){
        super(usernameIn, passwordIn, firstNameIn, lastNameIn);
        position = positionIn;
        salary = salaryIn;
    }
    
}
