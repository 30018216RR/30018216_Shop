package models;

/**
 *
 * @author 30018216
 */
public class User {
    
    // - - - - - Attributes - - - - -
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    // - - - - - Getters & Setters - - - - -
    
    // username
    public String getUsername(){
        return username;
    }
    public void setUsername(String usernameIn){
        username = usernameIn;
    }
    
    // password
    public String getPassword(){
        return password;
    }
    public void setPassword(String passwordIn){
        password = passwordIn;
    }
    
    // firstName
    public String getFirstName(){
        return firstName;
    }
    public void set(String firstNameIn){
        firstName = firstNameIn;
    }
    
    // lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastNameIn){
        lastName = lastNameIn;
    }
    
    // - - - - - Constructors - - - - -
    
    // 0 parameter constructor.
    public User(){
        username = "";
        password = "";
        firstName = "";
        lastName = "";
    }
    
    // 2 param (test)
        public User(String usernameIn, String passwordIn){
        username = usernameIn;
        password = passwordIn;
    }
    
    // 4 parameter constructor.
        public User(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn){
        username = usernameIn;
        password = passwordIn;
        firstName = firstNameIn;
        lastName = lastNameIn;
    }
        
}
