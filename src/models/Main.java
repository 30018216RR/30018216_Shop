package models;

import java.util.ArrayList;
// commented out in order to test the login method.

/**
 *
 * @author 30018216
 */
public class Main {
    // need to make this accessible via a public static void.
    public static void main(String[] args){
    DBManager db = new DBManager();
     ArrayList<Customer> loadedCustomers = db.loadCustomers();
     ArrayList<Staff> loadedStaff = db.loadStaff();
     ArrayList<Product> loadedProducts = db.loadProducts();
    }
}

    // comment these ArrayLists out when we are testing the login method.

//    // Test attributes - these two will be used in the Customer object.
//    String testCustomerUsername = "JamesH";
//    //String testUsername = "Donaldl";
//
//    String testCustomerPassword = "blahblah";
//    //String testPassword = "bleble";
//    
//    String testStaffUsername = "DonaldL1";
//    //String testUsername = "Jamesh1";
//
//    String testStaffPassword = "blehbleh1";
//    //String testPassword = "blahblah";
//
//    // Creating an object named customer to use in this method which runs the DBManager's login method and calls the two test attributes.
//    Customer customer = db.customerLogin(testCustomerUsername, testCustomerPassword);
//    // if/else statement to find out if two inputs have been entered and not left empty.
//    if( customer != null){
//    // If both values successfully match, print the output.
//        System.out.println("Success, " + customer.getUsername() + " logged into customer account with password: " + customer.getPassword() + ".");
//            }
//            // Otherwise, print an error message.
//            else{
//                System.out.println("Invalid customer login.");
//        }
//    
//    Staff staff = db.staffLogin(testStaffUsername, testStaffPassword);
//    if( staff != null){
//        System.out.println("Success, " + staff.getUsername() + " logged into staff account with password: " + staff.getPassword() + ".");
//            }
//            else{
//                System.out.println("Invalid staff login.");
//        }
//    } 
//}
        // as we don't have a display yet, we just debug it with breakpoints.
