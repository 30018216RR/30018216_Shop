package models;

// import the ArrayList util, and the connection objects Connection and DriverManager, as well as the Statement function.
import java.sql.Connection;
import java.sql.DriverManager;
// Statement
import java.sql.Statement;
// ResultSet
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
// ArrayList
import java.util.ArrayList;


/**
 *
 * @author 30018216
 */
public class DBManager {
    
    // using final to set a constant value that does not change.
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    // connection string
    private final String connectionString = "jdbc:ucanaccess://Data\\ShopDBx.accdb";
    
    // - - - - - Customer login - - - - -
    // load method is called, and this returns the ArrayList.
    // this needs two inputs - username and password - this are needed in order for this to run, so they are passed in.
    public Customer customerLogin(String username, String password){
        ArrayList<Customer> allCustomers = loadCustomers();
        
        // since all the customers are here (in allCustomers), we need to loop through them, i.e a for each loop.
        for(Customer customer : allCustomers){
            
        // customer is what this will use to refer to every result.
        // this will check that every username and password is correct, using the getters.
            if(customer.getUsername().equals(username) && customer.getPassword().equals(password)){
          
                // results are looped through and each result is checked, if both are correct, this is returned as customer.
                return customer;
            }
        }
        // if nothing has been found, null is returned, basically failing login.
         return null;
         
    // this completes the login method.
    // making a call to login method, looping through results, checking each one, returning hits, otherwise it returns null.
    }
    
    // - - - - - Staff login - - - - -
   
    public Staff staffLogin(String username, String password){
        ArrayList<Staff> allStaff = loadStaff();

        for(Staff staff : allStaff){
            
            if(staff.getUsername().equals(username) && staff.getPassword().equals(password)){    
                return staff;
            }
        }
         return null;
    }
    
    // - - - - - loadCustomers - - - - - -
    
    public ArrayList<Customer> loadCustomers(){
        ArrayList<Customer> allCustomers = new ArrayList();
        
    // when connecting to an external file, do so in a try catch to prevent crashing.
    // it does this first
        try{
            Class.forName(driver);
            // using a connection object (conn), an inbuilt Java function, and a variable name (connectionString).
            // this object needs to be imported in, sometimes the wrong one is brought in so we need to manually write it.
            Connection conn = DriverManager.getConnection(connectionString);
            // this is passed through a Statement, which also needs to be imported.
            Statement stmt = conn.createStatement();
            // the info in the database is then stored in a ResultSet (which also has a variable name) and the query is executed.
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");

            // now we get the results and make PetrolCars from them by using the right constructor with all of the values from the Petrol class.
            // we preferably do this in the order that they appear on the external database, spelled in the same way they appear in the columns.
            while (rs.next()){

                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postcode = rs.getString("Postcode");
                                
            // now we make the object using the class name, and a new variable name (petrolCarFromDB) and the correct constructor.
            Customer customersFromDB = new Customer(username, password, firstName, lastName, addressLine1, addressLine2, town, postcode);
            
                    // then this is added to the ArrayList.
            allCustomers.add(customersFromDB);
            }
            
        }
        // does this in case (printLn but lowercase L)
        catch(Exception ex){
           System.out.println("Error loading Customers: " + ex.getMessage()); 
        }
        // does this at the end
        finally{
            return allCustomers;
        }
    }
    
    // - - - - - loadCustomers - - - - -
    
    public ArrayList<Staff> loadStaff(){
        ArrayList<Staff> allStaff = new ArrayList();
        
    // when connecting to an external file, do so in a try catch to prevent crashing.
    // it does this first
        try{
            Class.forName(driver);
            // using a connection object (conn), an inbuilt Java function, and a variable name (connectionString).
            // this object needs to be imported in, sometimes the wrong one is brought in so we need to manually write it.
            Connection conn = DriverManager.getConnection(connectionString);
            // this is passed through a Statement, which also needs to be imported.
            Statement stmt = conn.createStatement();
            // the info in the database is then stored in a ResultSet (which also has a variable name) and the query is executed.
            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");

            // now we get the results and make PetrolCars from them by using the right constructor with all of the values from the Petrol class.
            // we preferably do this in the order that they appear on the external database, spelled in the same way they appear in the columns.
            while (rs.next()){
               
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getDouble("Salary");
                                
            // now we make the object using the class name, and a new variable name (petrolCarFromDB) and the correct constructor.
            Staff staffFromDB = new Staff(username, password, firstName, lastName, position, salary);
            
                    // then this is added to the ArrayList.
            allStaff.add(staffFromDB);
            }
            
        }
        // does this in case (printLn but lowercase L)
        catch(Exception ex){
           System.out.println("Error loading Customers: " + ex.getMessage()); 
        }
        // does this at the end
        finally{
            return allStaff;
        }
    }
    
    // Load all products for the Shop page.
    public ArrayList<Product> loadProducts(){
        ArrayList<Product> allProducts = new ArrayList();
        
    // when connecting to an external file, do so in a try catch to prevent crashing.
    // it does this first
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

            while (rs.next()){

                int productId = rs.getInt("ProductId");
                String productName = rs.getString("ProductName");
                double price = rs.getDouble("Price");
                int stockLevel = rs.getInt("StockLevel");
                String productType = rs.getString("ProductType");
                int wattageOutput = rs.getInt("WattageOutput");
                double efficiencyRating = rs.getDouble("EfficiencyRating");
                                
                // if the Heat Pump category matches the Heat Pump one, build this heat pump up using the above variables (pulled from the DB columns) 
                // and add it to the collection allProducts.
                if(productType.equals("HeatPump")){
                    HeatPump heatPumpFromDB = new HeatPump(productId, productName, price, stockLevel, productType, efficiencyRating);
                    allProducts.add(heatPumpFromDB);
                }
                else{
                    SolarPanel solarPanelFromDB = new SolarPanel(productId, productName, price, stockLevel, productType, wattageOutput);
                    allProducts.add(solarPanelFromDB);
                }
            }
            
        }
        // does this in case (printLn but lowercase L)
        catch(Exception ex){
           System.out.println("Error loading Products: " + ex.getMessage()); 
        }
        // does this at the end
        finally{
            return allProducts;
        }
    }
    
    // DELETE PRODUCT
    
        public void deleteProduct(int productId){
        
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Products WHERE ProductId = " + productId);
        }
            catch(Exception ex){
            System.out.println("Error deleting product: " + ex.getMessage());
        }
        
    }
    
    // EDIT PRODUCT
    public void editProduct(Product p){

    try{
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(connectionString);
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("UPDATE Products SET "
            + "ProductName = '" + p.getProductName() + "',"
            + "Price = '" + p.getPrice() + "',"
            + "StockLevel = '" + p.getStockLevel() + "'"
//            + "ProductType = '" + p.getProductType() + "'"
            + " WHERE ProductId = '" + p.getProductId() + "'");
        }
        catch(Exception ex){
        System.out.println("Error updating product: " + ex.getMessage());
        }
    }
    
    // Buy button (Basket page)
    // this requires the order info to write it to the db.
    // this will be passed in from the Basket jframe.
    public void writeOrder(Order o, String buyerUsername){
        
        try{
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(connectionString);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO Orders (OrderDate, Username, OrderTotal, Status) VALUES ("
                + "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(o.getOrderDate()) + "',"
                + "'" + buyerUsername + "',"
                + "'" + o.getOrderTotal() + "',"
                + "'" + o.getOrderStatus() + "')"
            );
        }
        catch(Exception ex){
            System.out.println("Error writing order: " + ex.getMessage());
        }
    
    }
    
}
    
